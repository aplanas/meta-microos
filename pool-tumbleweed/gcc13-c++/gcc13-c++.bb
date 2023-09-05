SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-c++-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "936cb79dfb55d594ef3f2ab1415dd350e2557311a515f5d7ad7c1b431535aa07f157c499dcf777127cbf667747ff34242618039eb63d6af0153b270a6c879b15"

RPROVIDES:${PN} += "gcc13-c++"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
