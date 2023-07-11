SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "7b53908a3e82d364b48b802de49328266e2baf0f5e91b2415d66ffd934aa9ae68fe50c70001c7afe0a9a183e2eae68b3e136bdbf38c0dd09fdf090b7880f84b6"

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
