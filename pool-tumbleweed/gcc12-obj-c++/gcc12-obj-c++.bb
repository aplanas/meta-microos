SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-obj-c++-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "4728a8b02c27e57494d6023c3a650ccad002f67d6547811bef584d4d858bff5c8927e222b45419302cee00400910fcd71eddc28c919bb47c1e61b04ff321572f"

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
