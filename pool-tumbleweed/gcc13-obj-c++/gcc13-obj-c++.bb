SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-obj-c++-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "97bf2a45877ffd4a0fb1eb71d8c117023e9bc453b17355b96364d7997ecfde385fc91d84982fa036fd8f1f9031c007ec4e69d7479df42b41badf82427e6b3ebf"

RPROVIDES:${PN} += "gcc13-obj-c++"

RDEPENDS:${PN} += "gcc13-c++ \
gcc13-objc \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
