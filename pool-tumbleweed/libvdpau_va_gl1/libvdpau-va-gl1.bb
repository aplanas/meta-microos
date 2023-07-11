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

RPM_NAME = "libvdpau_va_gl1-0.4.2-3.6.aarch64.rpm"
RPM_HASH = "dbfa02421a7a8bcfa34578289d478ee9750546c74dccdcfb117339627f44581c9b0e46a5916454c4136ecc19d9715dc42b34ab9d7733e36ffb8d0e5fba5f3065"

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
