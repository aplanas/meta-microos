SUMMARY = "GTK+ 2.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 2.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-gtk2-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "a9cf4ec63648ce6f63f9d8e294abc95539cc2ed7b3e5300387638f9e0d3a92ea954ac9bb284471249cbb104eeb1ed0619e1972a0167342e41562bbfbc650d889"

RPROVIDES:${PN} += "fcitx-gtk2 \
fcitx5-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libxkbcommon.so.0"

inherit rpm
