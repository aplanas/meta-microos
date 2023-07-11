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

RPM_NAME = "libguestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "6739ed3aceb6355ca8ba5278452b7220177908c73bd337117ff343e99c57d54aba9ab9e40537f84071c285d87b2271b140223de1d6a06c46b716f38f0193c316"

RPROVIDES:${PN} += "config-libguestfs \
libguestfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
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
