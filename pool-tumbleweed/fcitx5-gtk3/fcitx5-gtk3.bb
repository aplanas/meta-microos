SUMMARY = "GTK+ 3.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 3.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-gtk3-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "b3849304f86d260f2c058175289ff1a17e15dc83886ebb3e24363687dfbb061651744e1e1f3686d62cb24633cdca78117a2ea4417f3c5c06ab79e7c8faf54df9"

RPROVIDES:${PN} += "fcitx-gtk3 \
fcitx5-gtk3"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
