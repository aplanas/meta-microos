SUMMARY = "JBIG1 lossless image compression tools"
DESCRIPTION = "The jbigkit package contains tools for converting between PBM and JBIG1 \
formats."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "jbigkit-2.1-4.4.aarch64.rpm"
RPM_HASH = "3bdb682abb781dc9c0acaa4f093d0b96e217c639035c5615807274831b93626db90ceabbea82c489ab0747d0cb8c72de55e2bc655d0c8ea7659ca70f819f60b7"

RPROVIDES:${PN} += "jbigkit \
jbigkit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjbig.so.2()(64bit) \
libjbig85.so.2()(64bit)"

inherit rpm
