SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-devel-253.5-5.1.aarch64.rpm"
RPM_HASH = "e0787e88bfe9e3aa3d235c8f94dcb67cdec3b8a9a053af9eb6ef42f0b0e59f68433624009203d64a92843a1f829ff442521163e62e11663dffd96973aa9fd2af"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig-libsystemd \
pkgconfig-libudev \
systemd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
