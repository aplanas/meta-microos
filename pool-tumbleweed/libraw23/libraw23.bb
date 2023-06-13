SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw23-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "3253e42e62b13efa889bb1cdc5b57b7f94c7cf2d84de061917e73c435628fca4d9d09855806a3b89c40fa8edb76f9338bc60c13baeea29c08ac22e5f930000c3"

RPROVIDES:${PN} += "libraw.so.23()(64bit) \
libraw23 \
libraw23(aarch-64) \
libraw_r.so.23()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
