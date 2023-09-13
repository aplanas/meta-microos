SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "116.0.5845.179"

RPM_NAME = "chromedriver-116.0.5845.179-1.1.aarch64.rpm"
RPM_HASH = "d1c46245b7b5e1bab7024bf84929578495ea1c9fc85b7e3deb43a7c282bac25b91a9b4166842220ddfb411a5ad79f5f2682d5d53920fee07e6684a6675f6d742"

RPROVIDES:${PN} += "chromedriver"

RDEPENDS:${PN} += "chromium \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicuuc.so.73 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libre2.so.11 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1"

inherit rpm
