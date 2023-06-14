SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-client-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "d28c8faa98961f21a708ef042623d16a40b4addc35913b378034f66c0064da67afea80a1165416013b5f08b485ca415f2e9a486051ab6d228fbe60e4828dfc5b"

RPROVIDES:${PN} += "libvirt-client"

RDEPENDS:${PN} += "/bin/sh \
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
