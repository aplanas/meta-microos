SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-client-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "069f7b865b76cf0ee1578a87b249dd623833bee503224dce4e3e4f918cf36c2435323dab49d86f9f546a99cbc8f5880872525cc156064fa909cc20b3d82142a7"

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
