SUMMARY = "GTK+ 2.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 2.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-gtk2-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "aca83ea1fcac5f07897bb8315b08a42e2463e40c397822fe74c47db14c76fe97fbde3b8fb7a06fe19f406cbf64ab1f0122dc820cd3462091117cae58571487f5"

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
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
