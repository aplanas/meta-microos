SUMMARY = "Development files for the libpgf library"
DESCRIPTION = "This package contains header files and libraries needed for developing programs \
using the libpgf library."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf-devel-7.21.7-1.11.aarch64.rpm"
RPM_HASH = "eca4586ee917b2886aaea432e47d8cbba01535b8fc404d28e2c2774b7a1ad29f089e76dd62e86e5afceecd9ff2f413df17fb5578fa06720ddfd48e58d7aabb97"

RPROVIDES:${PN} += "libpgf-devel \
pkgconfig-libpgf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpgf7"

inherit rpm
