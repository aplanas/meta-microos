SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-0-0.0.12~rc5-1.10.aarch64.rpm"
RPM_HASH = "8ed8d261993ffc3de9bc0bc2c0745ac1d36543994eb9d159f264e5f52dae4ef934babe9d435f5e53fd457b9a7303617db4620db36855e0f43f81009036cd4656"

RPROVIDES:${PN} += "libax25-0 \
libax25.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libax25-common \
libc.so.6"

inherit rpm
