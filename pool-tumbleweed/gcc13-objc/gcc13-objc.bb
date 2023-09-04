SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-objc-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "54ef32d949bd201286b4fc0711c90e1db2d074555cd6a223e9e0aac60b86cc61ea7a3264561eda0dc16676bdfd633c68d9bd12fdd4a570597e54fa9053eb137e"

RPROVIDES:${PN} += "gcc13-objc"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
