SUMMARY = "Next generation of fcitx"
DESCRIPTION = "Fcitx 5 is a generic input method framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "aa80262fab541611d6482922125007b034ede4321ef85b661c13f736b4c745932160d7ecdfc852e62dc6005cfd57ed5b3b75bd0451bc3ea512be87b1f42219dd"

RPROVIDES:${PN} += "fcitx \
fcitx5 \
inputmethod \
libclassicui.so \
libclipboard.so \
libdbus.so \
libdbusfrontend.so \
libemoji.so \
libfcitx4frontend.so \
libibusfrontend.so \
libimselector.so \
libkimpanel.so \
libnotificationitem.so \
libnotifications.so \
libquickphrase.so \
libspell.so \
libtestfrontend.so \
libtestim.so \
libtestui.so \
libunicode.so \
libvirtualkeyboard.so \
libwayland.so \
libwaylandim.so \
libxcb.so \
libxim.so"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libwayland-client.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-imdkit.so.1 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
libz.so.1 \
systemd"

inherit rpm
