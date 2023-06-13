SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "490c7442b2003258f85b30421482a32b05724404a62ef643e7c5751f21cab9d06edeea65cefa38a66147773aa59245c35176f122f6ad690bd7d9c1050f514b14"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse-nostl3_0_5 \
libwx_gtk2u_adv-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
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
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
