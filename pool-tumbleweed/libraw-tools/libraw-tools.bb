SUMMARY = "Tools for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-tools-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "49f075e618f25f6dc4c13612e58fef207afb343f953c655f2bd219c778cf3d1b92bd5e855add9cbbea1c5081ad77c58d294e19948e734e675ad9112d6045e8a1"

RPROVIDES:${PN} += "libraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libraw-r.so.23 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
