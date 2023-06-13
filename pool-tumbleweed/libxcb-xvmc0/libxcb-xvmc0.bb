SUMMARY = "X11 Video Motion Compensation Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
X-Video Motion Compensation (XvMC), is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video-hardware."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xvmc0-1.15-2.2.aarch64.rpm"
RPM_HASH = "f4bbf5978143c8fb6920a5272dd602689f491dad5b21d3f00ceab9b09ace269a5e756766924f05f7e64aad04889f2be3b84fe138146283e7d87ba35938605bdf"

RPROVIDES:${PN} += "libxcb-xvmc.so.0()(64bit) \
libxcb-xvmc0 \
libxcb-xvmc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
