SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "116.0.5845.110"

RPM_NAME = "ungoogled-chromium-chromedriver-116.0.5845.110-1.1.aarch64.rpm"
RPM_HASH = "948e1805810246b1727aba19befeacd84370fb817a1d7dfcaf6a3c9281b06c6f2c449da527f800439439172872240b12e3a3cbd86aa5622c88205fb464d39d8c"

RPROVIDES:${PN} += "ungoogled-chromium-chromedriver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libffi.so.8 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libre2.so.11 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1 \
ungoogled-chromium"

inherit rpm
