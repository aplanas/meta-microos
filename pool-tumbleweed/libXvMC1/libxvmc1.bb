SUMMARY = "X-Video Motion Compensation library"
DESCRIPTION = "X-Video Motion Compensation (XvMC), is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video-hardware. \
 \
The supported portions to be offloaded by XvMC onto the GPU are \
motion compensation (mo comp) and inverse discrete cosine transform \
(iDCT) for MPEG-2 video. XvMC also supports offloading decoding of mo \
comp, iDCT, and VLD (Variable-Length Decoding) for MPEG-2/MPEG-4-ASP."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "libXvMC1-1.0.13-1.6.aarch64.rpm"
RPM_HASH = "da7aa138b04780fe3f5cf6bc6121f429b832a8584c0baa8d73ac413565365186abbc59a9750df6b8a53659c5e270eee340af3f9cc7fe7d2da0e0a764983c2218"

RPROVIDES:${PN} += "libXvMC.so.1()(64bit) \
libXvMC1 \
libXvMC1(aarch-64) \
libXvMCW.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
