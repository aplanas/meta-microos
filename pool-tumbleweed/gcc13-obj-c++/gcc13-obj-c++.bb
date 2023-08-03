SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-obj-c++-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "b0559e37dc141eef2b3a9bf54129776e529cc72dc66b128c740ad912efe275516e5838fb1a8c85a0fe0bf0ad1fa56426d573a06199654eb9cc2929d8476be5eb"

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
