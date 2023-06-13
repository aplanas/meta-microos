SUMMARY = "Simple DocBook DTD and Documentation"
DESCRIPTION = "This package contains the Simple DocBook DTD."
LICENSE = "HPND"

PV = "1.1"

RPM_NAME = "docbook-simple-1.1-1.6.noarch.rpm"
RPM_HASH = "4a3fdadc5bb1aaf52b1ee2d64d3f8fccea1fe770c4486f2aa046a45dd8795f85f9d4d04e88ba2c6f9b33aa5e16c71f40305ffe4d5566685f8b76d5de0909a1d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-simple"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/install-catalog \
/usr/bin/xmlcatalog \
libxml2-tools \
sgml-skel"

inherit rpm
