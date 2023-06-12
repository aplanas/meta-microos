SUMMARY = "Tools to generate base lib packages"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating base lib packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230527"

RPM_NAME = "build-mkbaselibs-20230527-1.1.noarch.rpm"
RPM_HASH = "947ea28c9825ad459f8153363579024dd3605637c151c778417451399d34b39d708ea64f528e43fbf34d92c761664cee605f143b8c7540807f61dfd76fb7745b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkbaselibs"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
