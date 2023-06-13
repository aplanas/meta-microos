SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "b9504214ec5d7780b5f9aa6ff83b0d5316e407016d3495ce8c855e8636cd69a1f9ee6feabcd56baefec2f34d44b74b75ea6104c3f1034dae573045c82d2394e3"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse3_0_5 \
libwx_gtk2u_adv-suse3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit)"

inherit rpm
