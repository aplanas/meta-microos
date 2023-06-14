SUMMARY = "VDPAU driver with OpenGL/VAAPI backend"
DESCRIPTION = "Many applications can use VDPAU to accelerate portions of the video \
decoding process and video post-processing to the GPU video hardware. \
Unfortunately, there is no such library for many graphic chipsets. \
Some applications also support VA-API but many of them, including \
Adobe Flash Player, don't. \
 \
This library proposes a generic VDPAU library. It uses OpenGL under \
the hood to accelerate drawing and scaling and VA-API (if \
available) to accelerate video decoding."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "libvdpau_va_gl1-0.4.2-3.5.aarch64.rpm"
RPM_HASH = "a69346d12cadeaa1f9f5a63ca7544e8cf5801095724850fb6baa419e8bced052017e7e097ed552522400abcccdd162d84e20005c30e607b225518f4b468643f4"

RPROVIDES:${PN} += "config-libvdpau-va-gl1 \
libvdpau-va-gl \
libvdpau-va-gl.so.1 \
libvdpau-va-gl1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libva-x11.so.2 \
libva.so.2"

inherit rpm
