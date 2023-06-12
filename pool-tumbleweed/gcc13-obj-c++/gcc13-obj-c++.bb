SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-obj-c++-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e12a58eff3412b4f6bf727a2c07d1e3ebb0ed88b203249970ed3ffbb9860970765c41bde51c6ab3975a5ae8135e39640fc35e9670e44471afa4ce356d60ffceb"

RPROVIDES:${PN} += "gcc13-obj-c++ \
gcc13-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc13-c++ \
gcc13-objc \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
