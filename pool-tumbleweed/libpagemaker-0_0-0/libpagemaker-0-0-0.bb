SUMMARY = "A library to import Adobe PageMaker documents"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-0_0-0-0.0.4-1.29.aarch64.rpm"
RPM_HASH = "eed0a2b6e1c95906bdae29b4f4d81060db86a35ce10538f50fcedcc5ce316d12bd372d48b5782d24c329810e4fb52e3da80817d636b1a192e0f94c50daf12e12"

RPROVIDES:${PN} += "libpagemaker-0.0.so.0()(64bit) \
libpagemaker-0_0-0 \
libpagemaker-0_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
