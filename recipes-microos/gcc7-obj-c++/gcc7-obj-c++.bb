SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-obj-c++-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "167ab9a5a085d26e77b5af4721cc6cf4a554e93f340037a6587da6588d6b2dc7acf1ed28c0eb967c11189b4f8b38b8448c96568a36dde1b4f17c58dac6e52f33"

RPROVIDES:${PN} += "gcc7-obj-c++ \
gcc7-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc7-c++ \
gcc7-objc \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libisl.so.23()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
