SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-devel-253.7-1.2.aarch64.rpm"
RPM_HASH = "6d9b504379063768b1263fcbafc9a4b4b93fe06dc647c00d65c9e8f243dc982ef4a1f94b804a6e034285c269a014a4010803b0637d4b34256eac72135e89a094"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
