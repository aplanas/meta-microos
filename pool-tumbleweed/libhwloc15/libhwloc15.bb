SUMMARY = "Runtime libraries for hwloc"
DESCRIPTION = "This package contains the run time libraries for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "libhwloc15-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "b80bbe77c7150b8e1029541b79f664cbac5fcda553376d2b051c41c8b2b5d44d3fc94db9151589eecdc9f68ef78d5dc003b9347f32c6a1f0a337856003c2c5d1"

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
