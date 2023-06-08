SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-obj-c++-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "8c69efcb35ac55dabe038e0f256b8db17a59a7fd5385d0cfb7ec4fef70089a20009a295d4df3dd1a3ce9c19bf38f851cbe51ee0a08228c9781f6a62724fd53fc"

RPROVIDES:${PN} += "gcc13-obj-c++ gcc13-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc13-c++ gcc13-objc libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
