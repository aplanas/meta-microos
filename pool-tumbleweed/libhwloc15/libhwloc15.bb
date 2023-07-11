SUMMARY = "Runtime libraries for hwloc"
DESCRIPTION = "This package contains the run time libraries for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "libhwloc15-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "aa97ccfd7e3054c2631a5f54ab8c31f138ca46c2d5b8d7f9f0ffd95b3333bc5eba00db8fdd06fa2230f7f4bcd47909c3952b4db707f210825f94f298693763b7"

RPROVIDES:${PN} += "libhwloc.so.15 \
libhwloc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwloc-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpciaccess.so.0 \
libxml2.so.2"

inherit rpm
