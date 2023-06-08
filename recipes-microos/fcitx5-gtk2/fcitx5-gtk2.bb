SUMMARY = "GTK+ 2.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 2.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "fcitx5-gtk2-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "8ad219869db83b654f7c1b0e8b0cba581449276b88ef30853455594c3b0ff616302d30837cbd064416c6fb1169c55e849bb8cf668c04edac06f6561b79554779"

RPROVIDES:${PN} += "fcitx-gtk2 fcitx5-gtk2 fcitx5-gtk2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gtk2-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5GClient.so.2()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
