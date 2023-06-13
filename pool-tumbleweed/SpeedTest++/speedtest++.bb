SUMMARY = "Yet another unofficial speedtest.net client cli interface"
DESCRIPTION = "Yet another unofficial speedtest.net client cli interface. \
 \
It supports the new (undocumented) raw TCP protocol for better accuracy."
LICENSE = "MIT"

PV = "1.11+git20210829.0f63cfb"

RPM_NAME = "SpeedTest++-1.11+git20210829.0f63cfb-1.5.aarch64.rpm"
RPM_HASH = "2838f970e2f91ade40ccf86b45892da2b26a18bc9365464a61cb64a962c0698c8547a95ed9ba36791bc9cc9f356d0866bdaed7d9d374117409aa00083eb8016e"

RPROVIDES:${PN} += "SpeedTest++ \
SpeedTest++(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
