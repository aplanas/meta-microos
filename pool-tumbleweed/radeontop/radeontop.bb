SUMMARY = "Tool to view Radeon GPU utilization"
DESCRIPTION = "A tool to view Radeon GPU utilization, both for the total activity percent \
and individual blocks. Supported cards are R600 and up, even Southern \
Islands should work fine. Works with both the open drivers and AMD \
Catalyst. The total GPU utilization is also valid for OpenCL loads; the \
other blocks are only useful in GL loads."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-1.4-1.9.aarch64.rpm"
RPM_HASH = "0cae7a39c5920647371415f96995e32e21d9dd9f25f3d09a3c5b3c5318489d912f644bc70ebef14c67c6a4a5fed8e8788da736e5739a88acb64f10b76a2e42b1"

RPROVIDES:${PN} += "libradeontop_xcb.so()(64bit) \
radeontop \
radeontop(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libdrm_amdgpu.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpciaccess.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libxcb-dri2.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
