SUMMARY = "Development files for scs"
DESCRIPTION = "SCS (splitting conic solver) is a numerical optimization package for \
solving large-scale convex cone problems. \
This package provides development libraries and headers for scs."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "scs-devel-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "1c063b60274b0124baf98cb74c50034aad48bf956cfa40b211b8f0d79f0f3a3e586213b19aff00267f19a9d724fee411fdab898f9826440bc7d616b4eb3c6e79"

RPROVIDES:${PN} += "libscsdir.so \
libscsindir.so \
scs-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
