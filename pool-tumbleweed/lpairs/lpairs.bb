SUMMARY = "Classical memory game"
DESCRIPTION = "LPairs is a classical memory game. This means you have to find pairs of \
identical cards which will then be removed. Your time and tries needed \
will be counted but there is no highscore chart or limit to this."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "lpairs-1.0.5-1.11.aarch64.rpm"
RPM_HASH = "6387e50c7dc84a784d1bc6e2bda4beca60a9c64cb952460aaf51719ff91a86d8734435fcaab86c6eec80ed9c4226d5d4be78f4e716f0d0a8834a5a5f4934a10b"

RPROVIDES:${PN} += "application() \
application(lpairs.desktop) \
lpairs \
lpairs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
