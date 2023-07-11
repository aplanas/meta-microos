SUMMARY = "Utilities for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "Several tools for reading and writing EWF files. \
It contains tools to acquire, verify and export EWF files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf-tools-20230212-2.7.aarch64.rpm"
RPM_HASH = "5d35ef769fd54b02cc24702523cbf3c69dda97a9d96ce54e36317504611cdeca589fa3483a3c57695bdbb356f6250a5b4a9ed12edf3cc0cfadac2952ffadd3e7"

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
