SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Codecs5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "83b8d15bfc82bea436e59e2c2ecd1495989658b626d8e2c2424e122f2c4ca06a1b0270f3b182e73dbd49a57924683ac4b2ee453b857eb9599727b786ba116cd4"

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
