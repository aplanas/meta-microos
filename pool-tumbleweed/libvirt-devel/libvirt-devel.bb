SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-devel-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "bc1060c9dfbdbba0c2959ed6887e417078910be330e7fa87e968455efa10b4ced54bda9d967ee0a20588d6e06bf86af9df0edaeb4d36faac92c8011b5b9c2c73"

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
