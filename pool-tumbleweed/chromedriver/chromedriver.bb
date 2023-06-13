SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "113.0.5672.126"

RPM_NAME = "chromedriver-113.0.5672.126-2.1.aarch64.rpm"
RPM_HASH = "8964e04e3a46eec53fe9fc6ae4c01c1b62589d156c4cbe0c575e1a7b5c96ff082c90d6cea79d4e2ab5663b42e487731a13747ecfaf816bc43ad58f9006d30049"

RPROVIDES:${PN} += "chromedriver \
chromedriver(aarch-64)"

RDEPENDS:${PN} += "chromium \
ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
