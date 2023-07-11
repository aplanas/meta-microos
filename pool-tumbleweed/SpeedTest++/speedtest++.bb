SUMMARY = "Yet another unofficial speedtest.net client cli interface"
DESCRIPTION = "Yet another unofficial speedtest.net client cli interface. \
 \
It supports the new (undocumented) raw TCP protocol for better accuracy."
LICENSE = "MIT"

PV = "1.11+git20210829.0f63cfb"

RPM_NAME = "SpeedTest++-1.11+git20210829.0f63cfb-1.7.aarch64.rpm"
RPM_HASH = "a9ddf6896006b89fea976a19c342d86b678cb0f9c94f6b4e6b338baaf67d186ee2ba04bd1e05ac0a72115724ce6aa921b2e910194d7313ed5bcaf94245b566cb"

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
