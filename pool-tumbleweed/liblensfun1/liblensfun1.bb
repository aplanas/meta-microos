SUMMARY = "Library files for lensfun/lensfun-devel"
DESCRIPTION = "Library files needed by the use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "liblensfun1-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "b595839755f0b0934de5834c19b17f5264c1e046514d05a9764e0cc816d1fb65299e7ec87444b39b1613e7d17a7048acc13d5d5aea08cefe12a2361690dd3e41"

RPROVIDES:${PN} += "lensfun \
liblensfun.so.1 \
liblensfun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lensfun-data \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
