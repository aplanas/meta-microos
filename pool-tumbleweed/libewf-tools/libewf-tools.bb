SUMMARY = "Utilities for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "Several tools for reading and writing EWF files. \
It contains tools to acquire, verify and export EWF files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf-tools-20230212-2.3.aarch64.rpm"
RPM_HASH = "0f83fdfbdcd34c60a1dd32f4813b06bf6f8df31adcd70163a1dc14eea42b8f163573738c0593c163d953e4ba1f8eafa37db0c38ef22951ec3c8010d38ca59f44"

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
