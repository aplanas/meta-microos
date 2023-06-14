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

RPROVIDES:${PN} += "libradeontop-xcb.so \
radeontop"

RDEPENDS:${PN} += "libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libncursesw.so.6 \
libpciaccess.so.0 \
libtinfo.so.6 \
libxcb-dri2.so.0 \
libxcb.so.1"

inherit rpm
