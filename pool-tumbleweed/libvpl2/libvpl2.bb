SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl2-2023.2.0-1.1.aarch64.rpm"
RPM_HASH = "9c2154fae43c5238ecca9928507543ffec397b42b8ed363257bae3a7a7a3efa4bebea1ad1c50c88e826bbb7d3d2042e93ec8c110f91531e90bc546785b272202"

RPROVIDES:${PN} += "libvpl.so.2()(64bit) \
libvpl2 \
libvpl2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
