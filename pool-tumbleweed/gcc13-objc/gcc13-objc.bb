SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-objc-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "21e393e129907f036aa2eafe1f600474f06a2feeb22f781998095c1ce2074da4f1e0e57eeab72d03449a0a2f8ac511fe4b626644ffb17253258a464c11faa1b1"

RPROVIDES:${PN} += "gcc13-objc"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
