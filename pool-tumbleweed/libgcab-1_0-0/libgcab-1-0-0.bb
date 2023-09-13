SUMMARY = "Cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides a system library to access cab files"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libgcab-1_0-0-1.6-1.1.aarch64.rpm"
RPM_HASH = "ebece7add3908ad7507d020d7f39db28153db50a257a013571d32f7c620c1e33d9e12e720a536137c2044b387b863ad81a43af500e627820b7a2204657306343"

RPROVIDES:${PN} += "libgcab-1-0-0 \
libgcab-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libz.so.1"

inherit rpm
