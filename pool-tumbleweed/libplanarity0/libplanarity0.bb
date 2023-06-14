SUMMARY = "Edge Addition Planarity Suite main library"
DESCRIPTION = "EAPS provides implementations of the edge addition planar graph \
embedding algorithm and related algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2.0"

RPM_NAME = "libplanarity0-3.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "8583350d4e04c92d423d14c29f39e0f14c7e660e6eef5d8d989c3c5605c7f0451d8bd6332d67541f1f4d76d95b18f0991d3ba429266d405d225d0f8773c14023"

RPROVIDES:${PN} += "libplanarity.so.0 \
libplanarity0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
