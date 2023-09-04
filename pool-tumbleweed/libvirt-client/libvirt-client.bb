SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-client-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "ac676ed35c65c08ed4925a67c5ea2d323b40ad6d56678493789784719e42770441aa8d1f0ec1bfdcb47e5c54d854471a705c0e6f7d81e16c1d9f3b7bd8719d2a"

RPROVIDES:${PN} += "libvirt-client"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
cyrus-sasl \
gnutls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libreadline.so.8 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
