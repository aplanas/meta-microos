SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Codecs5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7cea7be5d23cfcd8373ebbf0f432d7a9df86ca3bb5a319eb1d4a0c1a15a702a716028efa824d86bd1c3e5cd2aae30819c3c638ab68cdf1bcf5ef096b714be099"

RPROVIDES:${PN} += "libKF5Codecs.so.5 \
libKF5Codecs5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
