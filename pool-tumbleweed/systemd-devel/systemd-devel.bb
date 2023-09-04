SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-devel-253.8-1.2.aarch64.rpm"
RPM_HASH = "5c7ad8d16874361e19cf3cbe02c114edf30beeff30ddc65b90428b12f69870d877c8f86b8dd7e094b2d3412797dfaf1ef71fb899c684ba1c32cbfa882cb0e077"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
