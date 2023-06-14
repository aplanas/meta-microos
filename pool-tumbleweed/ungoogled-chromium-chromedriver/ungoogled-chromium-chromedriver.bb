SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "113.0.5672.126"

RPM_NAME = "ungoogled-chromium-chromedriver-113.0.5672.126-1.1.aarch64.rpm"
RPM_HASH = "870a55afe070412fa4ef2469302101150105845f9580e5a71ad9805c771b7697ef6dfd89874f3cfa4dd6a896b9f9fefcf556265931506d3c44a1acaac810920e"

RPROVIDES:${PN} += "ungoogled-chromium-chromedriver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicuuc.so.73 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libre2.so.10 \
libstdc++.so.6 \
libxcb.so.1 \
ungoogled-chromium"

inherit rpm
