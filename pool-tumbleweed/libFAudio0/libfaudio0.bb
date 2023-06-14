SUMMARY = "A reimplementation of the XNA Game Studio libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.03"

RPM_NAME = "libFAudio0-23.03-1.3.aarch64.rpm"
RPM_HASH = "32efda9e1e29c735b3d79379f8e927181d310d0f33b8ef9d58eab4bf516e2f50c57f07218b7451ce42f60dd16e36ded8951127e41a3d78967e14673581ea43a0"

RPROVIDES:${PN} += "libFAudio.so.0 \
libFAudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
