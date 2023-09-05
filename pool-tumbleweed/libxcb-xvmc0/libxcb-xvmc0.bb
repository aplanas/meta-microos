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

PV = "1.16"

RPM_NAME = "libxcb-xvmc0-1.16-1.1.aarch64.rpm"
RPM_HASH = "428c379b28166c16a032b0b02c68f484857dd58a7d092a07b9fba62a9f173dd6417d81d576dc9110fa3537c01555d58be78eff34579c5abdcd2bdd46f1f02f20"

RPROVIDES:${PN} += "libxcb-xvmc.so.0 \
libxcb-xvmc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
