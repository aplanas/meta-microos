SUMMARY = "Utilities for reading BIN/ISO/CUE image files through libodraw"
DESCRIPTION = "This subpackage contains the utility programs from libodraw, which \
can read optical disc (split) RAW image files such as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-tools-20210503-3.6.aarch64.rpm"
RPM_HASH = "ba980e96a123ff27c0e9021bc0ba2008bb0e2a61cf093c0e689addfa791dad44694e224060dde310e2a92d54e2c97d6f6608f1e4ce1578180b3e45b01fd66d92"

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
