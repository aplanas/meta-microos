SUMMARY = "Library for parsing the Apple Keynote presentations"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-0_1-1-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "00c0e3698b624e84666506336a5d064f06003c3bee1b69fd69aa3addaa3c43cefe9b270be03150ce46cb218ceeef305efa24008df37915d666602e881bb46a7a"

RPROVIDES:${PN} += "libetonyek-0.1.so.1()(64bit) \
libetonyek-0_1-1 \
libetonyek-0_1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblangtag.so.1()(64bit) \
libm.so.6()(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
