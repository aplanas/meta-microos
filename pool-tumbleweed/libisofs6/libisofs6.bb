SUMMARY = "Library for Creating ISO-9660 Filesystems"
DESCRIPTION = "Libisofs is a library for creating ISO-9660 filesystems with extensions like \
RockRidge or Joliet. It is also a full featured ISO-9660 editor, allowing you \
to modify an ISO image or multisession disc, including file addition/removal, \
change of file names and attributes, etc. \
 \
ISO-9660 images can be made bootable from CD, DVD, or BD via an El Torito boot \
record and appropriate boot image files from boot managers like GRUB, ISOLINUX, \
or system specific boot loaders. It is also possible to install a Master Boot \
Record for hard-disk-like media, e.g. USB memory sticks. \
 \
Libisofs supports the extension AAIP which allows to store ACLs and xattr in \
ISO-9660 filesystems and zisofs compression which is transparently uncompressed \
by some Linux kernels. It is possible to have data file content compressed to \
gzip format or to have it filtered by an external process."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libisofs6-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "0788118192e8beccaf2bd54a8d11bfe71008d157118cf869924bfae3d5678587c5911c8de7b581e6df94f80b927feef27f9d2a910bad1947c2efc0231d455e11"

RPROVIDES:${PN} += "libisofs.so.6 \
libisofs6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libjte.so.2 \
libz.so.1"

inherit rpm
