SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "116.0.5845.96"

RPM_NAME = "ungoogled-chromium-chromedriver-116.0.5845.96-1.1.aarch64.rpm"
RPM_HASH = "14da3afbd14a0af99ecd2fea94ffa7b9088cf612dbe19eb661c47cfd3f1b7fee8a048aad52a61d512926c35b4943683413dbe95ab1b664dd7163de09bceec1bb"

RPROVIDES:${PN} += "chromedriver \
ungoogled-chromium-chromedriver"

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
