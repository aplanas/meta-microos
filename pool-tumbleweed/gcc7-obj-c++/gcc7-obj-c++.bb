SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-obj-c++-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "e74b7e410239b2ce77383646e3c1de8073a6461b2e4d2486554fcb448a57f76d40e7e6d498c41482834a27ee7e5b59be97940918509c4c37751e9c1eeb2b2709"

RPROVIDES:${PN} += "gcc7-obj-c++"

RDEPENDS:${PN} += "gcc7-c++ \
gcc7-objc \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
