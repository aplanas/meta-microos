SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-c++-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "d7d31518fe397685f48f0d45dc24c9873803471c974a7249c25d680e19d6988181b738bb6d1378f32ca29ae565bc1b50d1f95ac976e24760f4b5ed380cf3c8e2"

RPROVIDES:${PN} += "gcc13-c++"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
