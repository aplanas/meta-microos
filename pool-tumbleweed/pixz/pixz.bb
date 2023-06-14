SUMMARY = "Parallel, indexing version of XZ"
DESCRIPTION = "The existing XZ Utils provide great compression in the .xz file format, but \
they produce just one big block of compressed data. Pixz instead produces a \
collection of smaller blocks which makes random access to the original data \
possible. This is especially useful for large tarballs. \
 \
Pixz supports automatic indexing and parallel compression and decompression \
using all available CPU cores."
LICENSE = "BSD-2-Clause"

PV = "1.0.7"

RPM_NAME = "pixz-1.0.7-1.9.aarch64.rpm"
RPM_HASH = "7be6028028f6bc1de28334a9b973e1c4a25bf9a2e6b322328d9093b54ec147f26f860fd55464d427a99609789c4c644b27817675ebd314920eceaee9f5e66354"

RPROVIDES:${PN} += "pixz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
liblzma.so.5"

inherit rpm
