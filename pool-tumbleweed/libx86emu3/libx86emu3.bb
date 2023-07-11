SUMMARY = "An x86 emulation library"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "libx86emu3-3.5-1.9.aarch64.rpm"
RPM_HASH = "cdf0f4652342d002dcd4e9427187d18111b9024d7d02e03bc0a2b97c39502b0bff3e38a1c57372b65f1eb90b06c84f24ba84a1a71a59562683943edf58cb5d2d"

RPROVIDES:${PN} += "libx86emu.so.3 \
libx86emu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
