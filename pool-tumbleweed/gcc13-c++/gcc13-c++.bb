SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-c++-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "c9a2db88462d82b97555b5a59d843dbe2c90113565be7fb55ea7694512c7c156d1f3fd3ad3ec552f8e6c197467d3d4084efdd5a5244c161e1de7210c0902a6d7"

RPROVIDES:${PN} += "gcc13-c++ \
gcc13-c++(aarch-64)"

RDEPENDS:${PN} += "gcc13 \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++6-devel-gcc13 \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
