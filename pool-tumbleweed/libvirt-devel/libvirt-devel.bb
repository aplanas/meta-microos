SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-devel-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "865ebf5e00083f9d3a1a3ce839fb3c29d1d62edd5065027db49323b4bbac66891fd5d268a8fa12f89fe772b527407fb980c8d1ae4fbcedb22fa0ea40aaf0df92"

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
