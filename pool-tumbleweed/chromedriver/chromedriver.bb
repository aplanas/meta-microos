SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "115.0.5790.98"

RPM_NAME = "chromedriver-115.0.5790.98-1.1.aarch64.rpm"
RPM_HASH = "2aa979c2d93eb56145095d468ffa54799cf6c16f8dbbb9cf54f2f5520afd1cfb7bdbb72ac31422803df469da7fb59dd4ec8013dc0d2a6deb26e820c495d3172e"

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
libre2.so.10 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1"

inherit rpm
