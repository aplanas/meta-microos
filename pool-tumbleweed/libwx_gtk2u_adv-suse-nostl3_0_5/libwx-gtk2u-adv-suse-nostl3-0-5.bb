SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "490c7442b2003258f85b30421482a32b05724404a62ef643e7c5751f21cab9d06edeea65cefa38a66147773aa59245c35176f122f6ad690bd7d9c1050f514b14"

RPROVIDES:${PN} += "libwx-gtk2u-adv-suse-nostl.so.3.0.5 \
libwx-gtk2u-adv-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
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
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
