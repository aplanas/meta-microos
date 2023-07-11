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

RPM_NAME = "libwoff2common1_0_2-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "1eb9c1ae53026de12d42ce01b7a7bad80729075f9a72316413b03ecc9f254160ada7fffc287d7416470a2147f161b1292ac0e4943cf1663e9ed13be087c72422"

RPROVIDES:${PN} += "libwoff2common.so.1.0.2 \
libwoff2common1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
