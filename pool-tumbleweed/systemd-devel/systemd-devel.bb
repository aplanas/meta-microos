SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-devel-253.7-2.1.aarch64.rpm"
RPM_HASH = "02f3c6ef68aefecad34bc1f50fa624605c6661536cb25bc6c59e2f5721be8be11c660c105867ad72f3e3275231f80613a6827b1ab56c89486e75542c245d062d"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
