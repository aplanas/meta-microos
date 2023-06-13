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

RPROVIDES:${PN} += "application() \
application(gparted.desktop) \
gparted \
gparted(aarch-64) \
metainfo() \
metainfo(gparted.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkexec \
gpart \
hdparm \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libparted-fs-resize.so.0()(64bit) \
libparted-fs-resize.so.0(LIBPARTED_FS_RESIZE_0.0.0)(64bit) \
libparted.so.2()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
mtools \
parted \
polkit \
util-linux \
xdg-utils"

inherit rpm
