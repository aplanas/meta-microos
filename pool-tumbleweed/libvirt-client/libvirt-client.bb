SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-client-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "217bd130b1a2c4a98310c534a18bd70aa98b6d9eef182fa3b2eb67648e91855a8940e143437c4a3b14a2933d38aa9d7cd854d33fb3620d222be9592fc73b8508"

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
