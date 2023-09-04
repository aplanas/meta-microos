SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Codecs5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "04209ef5a5cb56899842edebe017793af2462acf0bd1726dd46015576bb7c71c5c817d626643b4f05e5101507629271d4864a5c91a7ec821f1576b32c77481e4"

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
