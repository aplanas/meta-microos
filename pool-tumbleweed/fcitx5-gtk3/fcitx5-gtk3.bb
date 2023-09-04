SUMMARY = "GTK+ 3.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 3.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-gtk3-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "098342ad5eade54f8a84143e8a656fb00b210aae26f6cd8803b578170e320f7b2f9cb3afbd2059fdb43084e6f3c707b95c0e9407f7bd06a7e32d21d8963e7a2e"

RPROVIDES:${PN} += "fcitx-gtk3 \
fcitx5-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
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
