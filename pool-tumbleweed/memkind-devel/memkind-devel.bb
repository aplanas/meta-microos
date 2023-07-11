SUMMARY = "Development files for the 'memkind' user extensible heap manager"
DESCRIPTION = "Header files for building applications with libmemkind."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-devel-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "a96d878529b256319e20f538e774c929916888f721ec239123302e0d44220dd04944e476f7c0a25bafc37d3a18900e0e1db7728e64175e75322b1424e7015d27"

RPROVIDES:${PN} += "memkind-devel \
pkgconfig-memkind"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmemkind0"

inherit rpm
