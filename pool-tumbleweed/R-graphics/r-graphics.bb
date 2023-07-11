SUMMARY = "Package providing R-core graphics in R-graphics"
DESCRIPTION = "This package provides R-graphics, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-graphics-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "198d831d6be10d3a6e65ba441fb523554f3877cb708da080a38abd46e3c6e60fb8639d42aea8101d29b7ffdad10aeb403a0ea4819e4006f8928dd41ecd588155"

RPROVIDES:${PN} += "R-graphics"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
