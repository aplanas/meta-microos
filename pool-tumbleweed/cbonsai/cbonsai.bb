SUMMARY = "A bonsai tree generator for your terminal"
DESCRIPTION = "A beautifully random bonsai tree generator. It intelligently \
creates, colors, and positions a bonsai tree, and is entirely \
configurable via CLI options."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "cbonsai-1.3.1-1.7.aarch64.rpm"
RPM_HASH = "bb4270b76ba98d5f1eb2d3c6875b1cf7ce3b988c968eab0d1ed2bad318b8813447c0b442490abb7c6671bf11097101446546d2352c9e010494306b7ec7acbf32"

RPROVIDES:${PN} += "cbonsai"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
