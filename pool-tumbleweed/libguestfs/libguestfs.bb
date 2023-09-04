SUMMARY = "Access and modify virtual machine disk images"
DESCRIPTION = "Libguestfs is a library for accessing and modifying virtual machine \
disk images.  http://libguestfs.org \
 \
Libguestfs uses Linux kernel and qemu code, and can access any type of \
guest filesystem that Linux and qemu can, including but not limited \
to: ext2/3/4, btrfs, FAT and NTFS, LVM, many different disk partition \
schemes, qcow, qcow2, vmdk."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "7bffb79d28fb58b308d1a5d02a6be8ff7a3eff080c15b1a443173c3ccaf315dc5d01c1957f54021367d06a0b2c1f2fbc4880d8dc3a4bce9f4a5ad37a498fbd0d"

RPROVIDES:${PN} += "config-libguestfs \
libguestfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libfuse.so.2 \
libguestfs-appliance \
libguestfs.so.0 \
libm.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
libtirpc.so.3 \
libxml2.so.2"

inherit rpm
