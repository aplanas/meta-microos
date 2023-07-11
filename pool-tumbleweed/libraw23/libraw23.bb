SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw23-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "77361876a1a5f71785167beb356ac23bf93c0eb8ec680af2290625fc882313365dca7b9e4c845529fb8ffae9a45492ac1b503bb977fc7f45ea47f09a7508dd5c"

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
