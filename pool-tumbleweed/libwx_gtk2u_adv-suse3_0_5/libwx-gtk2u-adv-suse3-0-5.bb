SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "541430497c669b583801500f4fee8c7ce31b98852ea888a235c0bce344bf207f601fe017ce2e1ac0de07a71b7d77ca82ac60e85df3020a97add7b171b88ce11e"

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
