SUMMARY = "Utilities for reading BIN/ISO/CUE image files through libodraw"
DESCRIPTION = "This subpackage contains the utility programs from libodraw, which \
can read optical disc (split) RAW image files such as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw-tools-20210503-3.9.aarch64.rpm"
RPM_HASH = "461f4bcdeb3dc6a5e88508a89d033ccbcb71522d6b72612cb872e5169fe2b2a123b90196d502c8a93bfda60a6ca2357004f434a7f5366033270537a6f75f24c5"

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
