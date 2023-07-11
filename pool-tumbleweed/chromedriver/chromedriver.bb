SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "114.0.5735.198"

RPM_NAME = "chromedriver-114.0.5735.198-1.1.aarch64.rpm"
RPM_HASH = "b7c7908ae5f571070b9d4d565a067e8f5526d41734879ae2b49e764283dac8f3903301f99ebf38201e72b69e12fbbdff2ed75086caccec6cb3a34bf188dc615e"

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
