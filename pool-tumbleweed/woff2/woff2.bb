SUMMARY = "Web Open Font Format 2.0 library"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "woff2-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "612af3aadc6403b096f36ac7f17b5812f050e301de30b04cd3f4ea20f004bef15d659e5d7150510916f535882be0bb556ea94c49d207e3693a7342a3db829651"

RPROVIDES:${PN} += "woff2 \
woff2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwoff2common.so.1.0.2()(64bit) \
libwoff2dec.so.1.0.2()(64bit) \
libwoff2enc.so.1.0.2()(64bit)"

inherit rpm
