SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-objc-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "e26eca2f20840093bf4788acdbc298e59867c9a91342fe314d22fd47dd8942d743468f042f7b626471a21d712947fe749229d9ed0673b6e8d4b254b740b9a3ec"

RPROVIDES:${PN} += "gcc13-objc gcc13-objc(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libobjc4 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
