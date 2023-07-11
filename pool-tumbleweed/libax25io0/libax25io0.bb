SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25io0-0.0.12~rc5-1.10.aarch64.rpm"
RPM_HASH = "b77baa594846af66988eaeea57fd292fb3c0f91a7943256f1f3f77d50534cfec539326edd1ec12ccd1476db3eeefa04881ec4119ba75b99390ec9bbb9c43a859"

RPROVIDES:${PN} += "libax25io.so.0 \
libax25io0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libax25-common \
libc.so.6"

inherit rpm
