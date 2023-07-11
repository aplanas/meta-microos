SUMMARY = "Tool to view Radeon GPU utilization"
DESCRIPTION = "A tool to view Radeon GPU utilization, both for the total activity percent \
and individual blocks. Supported cards are R600 and up, even Southern \
Islands should work fine. Works with both the open drivers and AMD \
Catalyst. The total GPU utilization is also valid for OpenCL loads; the \
other blocks are only useful in GL loads."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-1.4-1.10.aarch64.rpm"
RPM_HASH = "ce1ab5dc08125861053dea2c807cb08cdd3a2cc88d6dc17a14d9d88a8ef2d23201208f9606637f66e0c72cc30a92ebe19873c41c875b89e4d5ff484b1b1c922a"

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
