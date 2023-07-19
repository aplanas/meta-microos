SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-devel-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "09ce64161941eab36aa1bab7327b89e2ffdfd290451452ad9591e4c706e6ee197fd07bcd37bb12b6e42a1e0715a9884fa8dde016bb4f5a38d28b4374d8ff8cfa"

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
