SUMMARY = "GTK+ 3.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 3.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "fcitx5-gtk3-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "33133883c5297cc136dedf3b571edc8c2486364bb90215cfc66a40880171ac9b0c12f612ef2bed25513b606ca1e133f55aaa20e139b48266c461694ce360ba1e"

RPROVIDES:${PN} += "fcitx-gtk3 fcitx5-gtk3 fcitx5-gtk3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gtk3-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5GClient.so.2()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
