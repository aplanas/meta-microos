SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-c++-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "394a305d28d60d60d681b31a7669fc024a89db790b106ad5cf99c05902ddc15930727296df6173daf89a3544f21625fa73f75b5f4ed271c73293fdd5290e7970"

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
