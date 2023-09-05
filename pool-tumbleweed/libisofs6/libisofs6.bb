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

RPM_NAME = "libisofs6-1.5.6-2.1.aarch64.rpm"
RPM_HASH = "7bf68f6a29037961df34ffb30dce210c5f9dc9d4d88a4b98aff01460215deaaa8e602b7939ee7dfcdaf32b1b244ef3ef54eab716245b5d433141f73aaca81336"

RPROVIDES:${PN} += "libisofs.so.6 \
libisofs6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libjte.so.2 \
libz.so.1"

inherit rpm
