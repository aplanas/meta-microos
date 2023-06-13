SUMMARY = "WebDriver for Google Chrome/Chromium"
DESCRIPTION = "WebDriver is an open source tool for automated testing of webapps across many browsers. It provides capabilities for navigating to web pages, user input, JavaScript execution, and more. ChromeDriver is a standalone server which implements WebDriver's wire protocol for Chromium. It is being developed by members of the Chromium and WebDriver teams."
LICENSE = "BSD-3-Clause"

PV = "113.0.5672.126"

RPM_NAME = "ungoogled-chromium-chromedriver-113.0.5672.126-1.1.aarch64.rpm"
RPM_HASH = "870a55afe070412fa4ef2469302101150105845f9580e5a71ad9805c771b7697ef6dfd89874f3cfa4dd6a896b9f9fefcf556265931506d3c44a1acaac810920e"

RPROVIDES:${PN} += "ungoogled-chromium-chromedriver \
ungoogled-chromium-chromedriver(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit) \
ungoogled-chromium"

inherit rpm
