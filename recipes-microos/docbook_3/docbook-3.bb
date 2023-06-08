SUMMARY = "DocBook DTD 3.x"
DESCRIPTION = "This package contains version 3.0 and 3.1 and an XML version.  It is \
suitable for writing technical documentation. \
 \
The documentation can be found in /usr/share/doc/packages/docbook_3."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.1"

RPM_NAME = "docbook_3-3.1-771.10.noarch.rpm"
RPM_HASH = "1ad8a1a8758b697a7b1a89b904ff1661c9922ec1365f5bfda441911e1241adbf0cda6557c3c05cd9d98b789bbb74377a6daefbf40a42f3e51ffefabe1dc20d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbhset docbk30 docbk31 docbook_3 docbook_3-dtd"
RDEPENDS:${PN} += "/bin/sh /usr/bin/sgml-register-catalog /usr/bin/xmlcatalog docbook_4 iso_ent"

inherit rpm
