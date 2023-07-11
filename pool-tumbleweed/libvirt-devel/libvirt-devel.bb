SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-devel-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "4fb0a5b36922f6a42f9a3ec402ef324126a54c2ff97d18c7e7081ed8eb3f719f7b66563db294d3cf28a6bfd4f6a14fd727dc368818eb525c9b01a7791f860b8a"

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
