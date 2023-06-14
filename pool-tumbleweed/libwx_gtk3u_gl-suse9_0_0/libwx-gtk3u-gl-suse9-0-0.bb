SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_gl-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "db9ba518ca627d04fb31a952e1c8a0c2b53d0ed3c099ba1547d3c57b5f829c15d83884d997c82517d260b8bd2cac3442ecf6ea5fe4c112f8c3a1a0c1bcfc5f25"

RPROVIDES:${PN} += "libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-gl-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
