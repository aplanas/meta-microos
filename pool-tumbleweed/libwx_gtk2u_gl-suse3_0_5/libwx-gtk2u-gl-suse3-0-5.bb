SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "e7f8a5a1b52b7a19b705bf863d5284ba464598088f0a19412772be3dff3de99a4c0c09e2516631ef03a4d2e16c419785445952004743922dfa2ce985f1c09b1b"

RPROVIDES:${PN} += "libwx-gtk2u-gl-suse.so.3.0.5 \
libwx-gtk2u-gl-suse3-0-5"

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
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
