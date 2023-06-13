SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswscale6-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "360dd4072c1e16c3a23141e8b7d49ab7656ec84aef0bf2458563fdc242c0dac041654aa51a69fbe6f94a7d0dc21baac53694d470f60317754166baded202c308"

RPROVIDES:${PN} += "libswscale.so.6()(64bit) \
libswscale6 \
libswscale6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavutil.so.57()(64bit) \
libavutil57 \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
