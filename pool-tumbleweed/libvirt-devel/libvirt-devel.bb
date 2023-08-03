SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-devel-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "62456fac2b328e35bbf486c4dbf5596915bb69f2b999339842cdef366820e2e8ed0f089c384682f676876f4641236d7bf39c2821eadfd1917bbd56e72230b9be"

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
