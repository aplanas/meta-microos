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

RPM_NAME = "libxcb-xvmc0-1.15-2.3.aarch64.rpm"
RPM_HASH = "4ba18e26e84aee50d2701e342dd0429b64f753f33c79e8fc5eb0a2a49cf062f78d1572ed3a7f646fee0b08b2d4fef43151aedc93deee3ab6ebd991ae77d13a1f"

RPROVIDES:${PN} += "libxcb-xvmc.so.0 \
libxcb-xvmc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
