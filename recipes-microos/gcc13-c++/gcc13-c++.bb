SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-c++-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "8e940040d5465b1e6fbb633ef97e1d075af8399f49c8ef4ac6a1ac42a4e46cc67b8637d00135286bb18b1f41c3e92cd71b3c9c8bdc3492945d10634c157c5d21"

RPROVIDES:${PN} += "gcc13-c++ gcc13-c++(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libstdc++6-devel-gcc13 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
