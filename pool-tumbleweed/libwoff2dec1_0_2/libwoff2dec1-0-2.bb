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

RPM_NAME = "libwoff2dec1_0_2-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "f9287aa4b25ec9b6c2801e53de8f624fd8af7b4b3abb063602affc083200b05a54bcbcc8fca4f568edea2e23f4c5a46331a706b8298c1c4b73ef296bf2499de2"

RPROVIDES:${PN} += "libwoff2dec.so.1.0.2 \
libwoff2dec1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2"

inherit rpm
