SUMMARY = "GTK+ 4.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 4.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "fcitx5-gtk4-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "1a9b0d3cdddc66887bc587693839e0efc1feebc6d47d75a660a83e0e0f64e1ad1f213f0e8b88ae1f2a6c8d3e23bcaa121bb3228e6256a7f68e34218381500d69"

RPROVIDES:${PN} += "fcitx5-gtk4 fcitx5-gtk4(aarch-64) libim-fcitx5.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh glib2-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5GClient.so.2()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
