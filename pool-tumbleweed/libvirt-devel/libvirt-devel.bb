SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-devel-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "be056f75d71c1f10fd5b351be933b31f8d091e95efb38c53afa6da3abcc67058ab7875eaad57519b9504977c5e51d37e885dce0eea2f6a12adc2f7537a878cff"

RPROVIDES:${PN} += "libvirt-devel \
libvirt-devel(aarch-64) \
pkgconfig(libvirt) \
pkgconfig(libvirt-admin) \
pkgconfig(libvirt-lxc) \
pkgconfig(libvirt-qemu)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-libs \
pkg-config \
pkgconfig(libvirt)"

inherit rpm
