SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "115.0.5790.102"

RPM_NAME = "chromedriver-115.0.5790.102-1.1.aarch64.rpm"
RPM_HASH = "12dc77e646bff0e2642b66ef94999636a386e1b83b499c69de8b030a556200a68c5177e6709b5755b18416829e8226b560d5fedc7910c86c6f4ea14a2c4f1c67"

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
