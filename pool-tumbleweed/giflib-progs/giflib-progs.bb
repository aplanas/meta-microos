SUMMARY = "Tools for Working with the GIF Library"
DESCRIPTION = "A tool for converting GIFs to various formats."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-progs-5.2.1-3.3.aarch64.rpm"
RPM_HASH = "1cbf0498a0cc0063aaf2fce5574390319b523525f9291f2f3d8dadb51f8bd4bf7d0785bf66492d1210f0478a632c0bf61bfe293c0280b34a2bc314e720c0b7fc"

RPROVIDES:${PN} += "giflib-progs \
ungif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
