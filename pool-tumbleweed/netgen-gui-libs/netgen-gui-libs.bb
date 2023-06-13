SUMMARY = "NETGEN mesher library - GUI part"
DESCRIPTION = "GUI support for NETGEN mesh generator shared libraries."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-gui-libs-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "2fd25cbed8beb026e3a7fc62e2fd0e15c7a007948615467eba3e2c190c9fbbca12c557a67f73a9c4ec97c9f4794a8b40d2f6d5884b3c158aa581ffcf8eb1d701"

RPROVIDES:${PN} += "libnggui.so()(64bit) \
netgen-gui-libs \
netgen-gui-libs(aarch-64) \
netgen:/usr/lib64/netgen/libnggui.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libX11.so.6()(64bit) \
libXmu.so.6()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libngcore.so()(64bit) \
libnglib.so()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit)"

inherit rpm
