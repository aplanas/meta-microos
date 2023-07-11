SUMMARY = "Gnome Partition Editor"
DESCRIPTION = "GParted is a utility for creating, destroying, resizing, moving, \
checking and copying partitions, and the filesystems on them. This is \
useful for creating space for new operating systems, reorganizing \
disk usage, copying data residing on hard disks and mirroring one \
partition with another (disk imaging)."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "gparted-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "58c7eba5a777a44bcd7ebc4d0709bcfdc2ba251b49c8dd9f9032ea1da402aae358452dc4c0647ead75991b60862584482d3b654118a51b63981c7e01d09e702f"

RPROVIDES:${PN} += "gparted"

RDEPENDS:${PN} += "/usr/bin/pkexec \
/usr/bin/sh \
gpart \
hdparm \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libparted-fs-resize.so.0 \
libparted.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
mtools \
parted \
polkit \
util-linux \
xdg-utils"

inherit rpm
