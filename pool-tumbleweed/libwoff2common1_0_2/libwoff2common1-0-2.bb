SUMMARY = "Shared library for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains the shared library for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libwoff2common1_0_2-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "4487542fe6519676c7f8d3544215d0b894b887595260482d825246de813d45703601aea1a41939c5caed06b94a42e6d81852e4afae430cf0794369f97472ea93"

RPROVIDES:${PN} += "libwoff2common.so.1.0.2 \
libwoff2common1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
