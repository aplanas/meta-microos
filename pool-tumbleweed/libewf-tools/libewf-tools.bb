SUMMARY = "Utilities for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "Several tools for reading and writing EWF files. \
It contains tools to acquire, verify and export EWF files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf-tools-20230212-2.8.aarch64.rpm"
RPM_HASH = "c7828388d613d41140545134e613d15e71c64352a73cec9122da3bf87fedcca0246c0ec30f407d16ad1014cad749ae16640f767c4f0a017d9a73d0a278ac16c7"

RPROVIDES:${PN} += "libewf-tools"

RDEPENDS:${PN} += "/usr/bin/env \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcdatetime.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libewf.so.3 \
libfdatetime.so.1 \
libfuse.so.2 \
libhmac.so.1 \
libodraw.so.1 \
libsmdev.so.1 \
libsmraw.so.1 \
libuna.so.1 \
python3-fuse"

inherit rpm
