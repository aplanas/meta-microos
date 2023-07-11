SUMMARY = "Utilities for reading BIN/ISO/CUE image files through libodraw"
DESCRIPTION = "This subpackage contains the utility programs from libodraw, which \
can read optical disc (split) RAW image files such as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-tools-20210503-3.8.aarch64.rpm"
RPM_HASH = "cc47d6844a78b10f2a07dea22f5966a520844a88aab8d4a86f7fff64079c929efac2573044aba14b77c6f0a7d55939568969eb8e8167bf9cb048f0f5022b68e7"

RPROVIDES:${PN} += "libodraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libhmac.so.1 \
libodraw.so.1 \
libodraw1"

inherit rpm
