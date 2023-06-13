SUMMARY = "Development files for AllegroGL"
DESCRIPTION = "This package is needed to build programs that use AllegroGL."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl44-devel-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "420fabf41eb93542c694be38a92de73b2e6b75a72965c4035739519dfd7bbd0c2845e90cf01221e1e64582a8d8541c63326694b54413300cefe8854231cc3420"

RPROVIDES:${PN} += "liballeggl44-devel \
liballeggl44-devel(aarch-64) \
pkgconfig(allegrogl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballeggl4_4 \
pkgconfig(allegro)"

inherit rpm
