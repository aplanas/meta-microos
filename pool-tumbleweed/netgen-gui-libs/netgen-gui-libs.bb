SUMMARY = "NETGEN mesher library - GUI part"
DESCRIPTION = "GUI support for NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-gui-libs-6.2.2301-1.5.aarch64.rpm"
RPM_HASH = "3c1e1c4009035a22871412b59f9c8f8ffb824f96dcb0512371df223e3c5c37ad6d47853d0ece40cece21f44fb4d6a65023c2064afdc26f2322e0555ebc4fda22"

RPROVIDES:${PN} += "libnggui.so \
netgen-/usr/lib64/netgen/libnggui.so \
netgen-gui-libs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libXmu.so.6 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libngcore.so \
libnglib.so \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
