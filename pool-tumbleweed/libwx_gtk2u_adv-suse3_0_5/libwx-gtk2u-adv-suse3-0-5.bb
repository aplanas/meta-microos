SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "b9504214ec5d7780b5f9aa6ff83b0d5316e407016d3495ce8c855e8636cd69a1f9ee6feabcd56baefec2f34d44b74b75ea6104c3f1034dae573045c82d2394e3"

RPROVIDES:${PN} += "libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-adv-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
