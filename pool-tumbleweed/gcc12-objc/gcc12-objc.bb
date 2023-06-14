SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-objc-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "de09394392aa53e095d723ed27c3a359ac1fa960b24a36fce4c41d501c07ad301919aa3badc8c950d60b82b2c862c73cab684661a93020743957a5f828d88419"

RPROVIDES:${PN} += "gcc12-objc"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
