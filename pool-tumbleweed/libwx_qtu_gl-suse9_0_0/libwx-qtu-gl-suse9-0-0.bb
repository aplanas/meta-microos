SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_gl-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "a6524444e78c18810530b38efeb027d9cea83e83e4f0ddf16991fe3a117135ceca90ab6e81bf365291bc51b48198c33dc95717ef9f2a19bfaafee447074e3463"

RPROVIDES:${PN} += "libwx-qtu-gl-suse.so.9.0.0 \
libwx-qtu-gl-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
