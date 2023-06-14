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

RPROVIDES:${PN} += "libraw-r.so.23 \
libraw.so.23 \
libraw23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
