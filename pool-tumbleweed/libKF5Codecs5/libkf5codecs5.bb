SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Codecs5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "76d1d55f325aaa6d437a146932a00baccb1da5d6cdee09030af5774c0bd5f8ad3c4227a3779c82c18c9553d2f46f7add06dda8c4a1c482d1bf693abe93620f9a"

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
