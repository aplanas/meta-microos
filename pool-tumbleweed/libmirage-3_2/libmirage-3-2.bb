SUMMARY = "CD-ROM image format plugins for libmirage"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package provides the image format plugins for libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-3_2-3.2.6-1.9.aarch64.rpm"
RPM_HASH = "a92a94b43a36b295ab37dc41d0936ca06a53626a7ba589f15b2976c01d1dd9b0fa1910be63201cbf0171616867aed847cea8ae329250c8b14294a4e1eb4e084d"

RPROVIDES:${PN} += "libmirage-3-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libmirage.so.11 \
libsamplerate.so.0 \
libsndfile.so.1 \
libz.so.1"

inherit rpm
