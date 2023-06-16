SUMMARY = "DocBook DTD Version 4.x"
DESCRIPTION = "DocBook is a schema. It is particularly well-suited to books and papers \
about computer hardware and software (though it is not limited to these \
applications at all). This package has SGML- and XML-DTD versions \
included. Some versions of DocBook contain also a RELAX NG and W3C \
Schema."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.5"

RPM_NAME = "docbook_4-4.5-143.11.noarch.rpm"
RPM_HASH = "c46023a6c4086a4cbd6299e1114abab079de594b9e91e3076e6609fd07abe816e5406b0c200446c856427c0aaf9bae1febe3b131aae4790e026d7a8945c28f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-4 \
docbook \
docbook-4 \
docbook-dtd \
docbook-dtds"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xmlcatalog \
awk \
grep \
iso-ent \
sed \
sgml-skel"

inherit rpm
