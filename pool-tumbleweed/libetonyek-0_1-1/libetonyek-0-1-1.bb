SUMMARY = "Library for parsing the Apple Keynote presentations"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-0_1-1-0.1.10-2.1.aarch64.rpm"
RPM_HASH = "5f8b26bf0b41057086d3886aca8d6fdb743dacdcc609947d923520e4b874e7a1b1f481f49d5a44ddfdb85cc2955ecf56fe56aa7fa6da8def2124c4623b4075e6"

RPROVIDES:${PN} += "libetonyek-0-1-1 \
libetonyek-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblangtag.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
