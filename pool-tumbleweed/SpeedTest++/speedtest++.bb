SUMMARY = "Yet another unofficial speedtest.net client cli interface"
DESCRIPTION = "Yet another unofficial speedtest.net client cli interface. \
 \
It supports the new (undocumented) raw TCP protocol for better accuracy."
LICENSE = "MIT"

PV = "1.11+git20210829.0f63cfb"

RPM_NAME = "SpeedTest++-1.11+git20210829.0f63cfb-1.5.aarch64.rpm"
RPM_HASH = "2838f970e2f91ade40ccf86b45892da2b26a18bc9365464a61cb64a962c0698c8547a95ed9ba36791bc9cc9f356d0866bdaed7d9d374117409aa00083eb8016e"

RPROVIDES:${PN} += "SpeedTest++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
