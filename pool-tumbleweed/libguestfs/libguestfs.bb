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

RPM_NAME = "libguestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "dfa2b6b21efe8841c4191ce9dc1e0687c9787bff6326d7f925eebf8ff983a98bfaf0b90ab3e953acd584f35e35a22977256936346b0ade5461902679f90d4ea9"

RPROVIDES:${PN} += "config-libguestfs \
libguestfs"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libfuse.so.2 \
libguestfs.so.0 \
libm.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
libtirpc.so.3 \
libxml2.so.2 \
supermin"

inherit rpm
