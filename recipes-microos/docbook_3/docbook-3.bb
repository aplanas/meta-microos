SUMMARY = "DocBook DTD 3.x"
DESCRIPTION = "This package contains version 3.0 and 3.1 and an XML version.  It is \
suitable for writing technical documentation. \
 \
The documentation can be found in /usr/share/doc/packages/docbook_3."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.1"

RPM_NAME = "docbook_3-3.1-773.1.noarch.rpm"
RPM_HASH = "667835342236ef0e2aa9c01edffd83806cfbf1ae9e7f10a364091be9d9b3097dd32c87359cc802d73b2dacf3ce86096979fbb0334f1cfa75bc815ae1fae8df8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook_3"
RDEPENDS:${PN} += "/bin/sh /usr/bin/sgml-register-catalog /usr/bin/xmlcatalog docbook_4 iso_ent"

inherit rpm
