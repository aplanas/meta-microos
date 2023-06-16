SUMMARY = "Gnome Partition Editor"
DESCRIPTION = "GParted is a utility for creating, destroying, resizing, moving, \
checking and copying partitions, and the filesystems on them. This is \
useful for creating space for new operating systems, reorganizing \
disk usage, copying data residing on hard disks and mirroring one \
partition with another (disk imaging)."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "gparted-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "9412dc7b8791dbfc9a8656d8c09b1e777a0951beb481ce3ccbce8c18fc3da48c337ab02ca1874dae9c2e422d5e983486178be42cdd2a9d191da952b3db6955e7"

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
