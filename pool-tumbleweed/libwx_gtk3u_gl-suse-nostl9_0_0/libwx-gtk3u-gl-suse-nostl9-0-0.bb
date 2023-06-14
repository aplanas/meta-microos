SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_gl-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "583ab9d009a2f6e6cac08af5678f7a1e37589550347b9751d0819d42efe662729bb81b1c7bb9453f9b0e936fd1ca963ed7fb9681081e2eb7c3a213d209e5e7a6"

RPROVIDES:${PN} += "libwx-gtk3u-gl-suse-nostl.so.9.0.0 \
libwx-gtk3u-gl-suse-nostl9-0-0"

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
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
