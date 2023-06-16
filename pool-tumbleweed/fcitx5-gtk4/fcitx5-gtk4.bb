SUMMARY = "GTK+ 4.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 4.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-gtk4-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "37bfc9688c0e9140730ce3596874c6b807fb55d3c71fea1f516932cbe079f04e6e40783102c3ba77341a7d141b9d4b86b2405a45e291f1fc357295a0ca3879dd"

RPROVIDES:${PN} += "fcitx5-gtk4 \
libim-fcitx5.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
