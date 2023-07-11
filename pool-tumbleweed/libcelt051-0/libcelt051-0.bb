SUMMARY = "CELT is a very low delay audio codec"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "libcelt051-0-0.5.1.3-10.30.aarch64.rpm"
RPM_HASH = "27a24258e996b30123f0cd94412b6f0b1c5f41ba861a6a23a7dbdaa70486f927428f3e57321dd6afff56fa770f2d77e7ca27962ceee533c6b63cfba54ddf5871"

RPROVIDES:${PN} += "libcelt051-0 \
libcelt051.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
