SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig10-4.3.0-1.9.aarch64.rpm"
RPM_HASH = "417dfbb3dc798597fa7e1842212b88909ec8a706ba0a665605320f6a5dd489952f20043a87219bd80ef2b55afa5411b6658a0d9c21bd918b0fff9159b67fb1aa"

RPROVIDES:${PN} += "config-libgig10 \
libgig.so.10 \
libgig10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
