SUMMARY = "Disk Manager"
DESCRIPTION = "The Udisks project provides a daemon, tools and libraries to access and \
manipulate disks, storage devices and technologies."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "3ae789f4f4969fa6794a051a3d453c9b19a7f40aca85ad527797ff7a90d23ad478489e728365ff33e5493269258b40b4ba5c1f3c0551dc49ab5d8455e7cc6067"

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
