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

RPM_NAME = "libguestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "8e95fda822e125eb5697d37c5dc9136da5a8e27b743167f3de56ec135518b0c70556e4eab5fe34e449cce6bf57d737ef160af274f0cdc8336e0a83bfb50b00c9"

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
