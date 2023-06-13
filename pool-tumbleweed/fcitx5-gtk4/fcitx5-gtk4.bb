SUMMARY = "GTK+ 4.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 4.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-gtk4-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "37bfc9688c0e9140730ce3596874c6b807fb55d3c71fea1f516932cbe079f04e6e40783102c3ba77341a7d141b9d4b86b2405a45e291f1fc357295a0ca3879dd"

RPROVIDES:${PN} += "fcitx5-gtk4 \
fcitx5-gtk4(aarch-64) \
libim-fcitx5.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitx5GClient.so.2()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
