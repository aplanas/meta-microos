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

RPM_NAME = "libmirage-3_2-3.2.6-1.8.aarch64.rpm"
RPM_HASH = "857c6392b3ef910b9bcb95864e915fe738a98a68d3fa2578975b61b8126a301a76b66a5dfa0fbae575206868fc33c2cc713708054275ebfa7eb0171ab8735ca9"

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
