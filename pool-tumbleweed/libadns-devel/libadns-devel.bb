SUMMARY = "Libraries and header files to develop programs with libadns support"
DESCRIPTION = "Libadns-devel includes the header file and static library to develop \
programs with libads support."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libadns-devel-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "9adb49c1c3d8aa47e41b80fa50e030f19dbf4b55dc37655855b2c93f1778f6f5b3d3a63778073c2923f94fd9aab30cffc3dde2c0bf0555cb960ea0ffc963c75b"

RPROVIDES:${PN} += "libadns-devel"

RDEPENDS:${PN} += "glibc-devel \
libadns1"

inherit rpm
