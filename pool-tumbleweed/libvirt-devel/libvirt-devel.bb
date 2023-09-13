SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-devel-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "3c3a5283cac4c4a637567d045019e96c651242783e4899841fce1dfea824434c6e09278c84d1bae567e14de4738170759465373a0aed4d465d50b81e05419589"

RPROVIDES:${PN} += "libvirt-devel \
pkgconfig-libvirt \
pkgconfig-libvirt-admin \
pkgconfig-libvirt-lxc \
pkgconfig-libvirt-qemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-libs \
pkg-config \
pkgconfig-libvirt"

inherit rpm
