SUMMARY = "Next generation of fcitx"
DESCRIPTION = "Fcitx 5 is a generic input method framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "fcitx5-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "0eefef14b15fc090d0accec9dce686dcf7110c5df4ff7b420cffa94a6b1b2fa09ad5ce6f6d3c46f97b82e51265e1d4e53bf1b1cce319504489a05b1f89fe3588"

RPROVIDES:${PN} += "application() \
application(fcitx5-configtool.desktop) \
application(org.fcitx.Fcitx5.desktop) \
fcitx \
fcitx5 \
fcitx5(aarch-64) \
inputmethod \
libclassicui.so()(64bit) \
libclipboard.so()(64bit) \
libdbus.so()(64bit) \
libdbusfrontend.so()(64bit) \
libemoji.so()(64bit) \
libfcitx4frontend.so()(64bit) \
libibusfrontend.so()(64bit) \
libimselector.so()(64bit) \
libkimpanel.so()(64bit) \
libnotificationitem.so()(64bit) \
libnotifications.so()(64bit) \
libquickphrase.so()(64bit) \
libspell.so()(64bit) \
libtestfrontend.so()(64bit) \
libtestim.so()(64bit) \
libtestui.so()(64bit) \
libunicode.so()(64bit) \
libwayland.so()(64bit) \
libwaylandim.so()(64bit) \
libxcb.so()(64bit) \
libxim.so()(64bit) \
metainfo() \
metainfo(org.fcitx.Fcitx5.metainfo.xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-imdkit.so.1()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb-xinerama.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbfile.so.1()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm
