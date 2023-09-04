SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-obj-c++-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "807c9881fa4fa0b229222a13c6813cd43c883e8db5e5e5ae0556698debfa55bcfface1b392efe8d6ab27e171abfba51bd0d89eb003116548a13a9f1969d55e0d"

RPROVIDES:${PN} += "gcc13-obj-c++"

RDEPENDS:${PN} += "gcc13-c++ \
gcc13-objc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
