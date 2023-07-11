SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-obj-c++-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "da8176e18e2a7a6e82ebed7ecf43511e1b8f4d8fe4d312ad5a840e016a58627cf5daefe5e07b0c6813aa7334c87426b6965f09ce982fbe520abfdaa6bee96dd2"

RPROVIDES:${PN} += "gcc12-obj-c++"

RDEPENDS:${PN} += "gcc12-c++ \
gcc12-objc \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
