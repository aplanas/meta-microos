SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_gl-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "05fc537bfca481ec82c13567b51302289af0cdf4042e546a34aa4d857f7ef8dd9ab20bb3a38ea3b2d828c0834f4f493d9de6a326a887d756a2098c33f8cdd51c"

RPROVIDES:${PN} += "libwx-gtk2u-gl-suse.so.9.0.0 \
libwx-gtk2u-gl-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
