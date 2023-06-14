SUMMARY = "NETGEN mesher library - GUI part"
DESCRIPTION = "GUI support for NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-gui-libs-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "2fd25cbed8beb026e3a7fc62e2fd0e15c7a007948615467eba3e2c190c9fbbca12c557a67f73a9c4ec97c9f4794a8b40d2f6d5884b3c158aa581ffcf8eb1d701"

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
libpython3.10.so.1.0 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
