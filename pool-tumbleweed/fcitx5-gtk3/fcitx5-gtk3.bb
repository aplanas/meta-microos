SUMMARY = "GTK+ 3.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 3.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-gtk3-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "b3849304f86d260f2c058175289ff1a17e15dc83886ebb3e24363687dfbb061651744e1e1f3686d62cb24633cdca78117a2ea4417f3c5c06ab79e7c8faf54df9"

RPROVIDES:${PN} += "fcitx-gtk3 \
fcitx5-gtk3 \
fcitx5-gtk3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5GClient.so.2()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
