SUMMARY = "Disk Manager"
DESCRIPTION = "The Udisks project provides a daemon, tools and libraries to access and \
manipulate disks, storage devices and technologies."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "153531357067e826fcaab253d50a3e53ba98b5254881b1469d069fc8b95e257c9935fd67b30a37b823f479dc06d55158f29a088d94be9df0786be5bcc639c6a0"

RPROVIDES:${PN} += "config-udisks2 \
udisks2"

RDEPENDS:${PN} += "/usr/bin/sh \
cryptsetup \
dbus-1 \
dosfstools \
e2fsprogs \
eject \
gptfdisk \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libatasmart-utils \
libatasmart.so.4 \
libbd-utils.so.2 \
libblockdev \
libblockdev-crypto \
libblockdev-fs \
libblockdev-loop \
libblockdev-mdraid \
libblockdev-part \
libblockdev-swap \
libblockdev.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmount.so.1 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libudisks2-0 \
libudisks2.so.0 \
libuuid.so.1 \
systemd \
udev \
util-linux \
xfsprogs"

inherit rpm
