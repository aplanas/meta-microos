SUMMARY = "Development tools for Video Multi-Method Assessment Fusion"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm developed by \
Netflix. \
This package contains the library API definitions."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "vmaf-devel-2.3.1-3.2.aarch64.rpm"
RPM_HASH = "246c1615ded843a1cec5d4d39a2d011a6bf957d3f490107bde3453819e8be5413509a3c2c28eba8a250aa8f5d9a557b404dc33f34ad7d5da09e3eec16e9a455a"

RPROVIDES:${PN} += "pkgconfig(libvmaf) \
vmaf-devel \
vmaf-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libvmaf1"

inherit rpm
