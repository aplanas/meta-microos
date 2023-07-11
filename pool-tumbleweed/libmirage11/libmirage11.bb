SUMMARY = "A CD-ROM image access library"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage11-3.2.6-1.9.aarch64.rpm"
RPM_HASH = "c1a23592505283b3ed396fb70a0bb1aa136c02f87694752cb4dc2bea452e7bb0da4345987fd777e21ef5cd751728a65463d72d9c904cae46c512971667e3e822"

RPROVIDES:${PN} += "libmirage.so.11 \
libmirage11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libmirage-3-2"

inherit rpm
