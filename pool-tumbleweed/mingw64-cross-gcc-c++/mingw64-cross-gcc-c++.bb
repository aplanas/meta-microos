SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-c++-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "cb7071c67451a2b572abd1e20260eb80b3b2d47d4b068633bc7d83eb0afa61c69ef335f20960f0d8f0a6fab05eb1c77b6634c4a3ec8174f121391eed4dae55a6"

RPROVIDES:${PN} += "mingw64-cross-gcc-c++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-gcc"

inherit rpm
