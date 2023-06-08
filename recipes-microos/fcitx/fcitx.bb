SUMMARY = "Flexible Context-aware Input Tool with eXtension"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "0f1524d14f3dcffa9fcf1d0c771accdaa6a1cbf9e35329996c7b237f5f206a7385969ea79c60dba9d6a6193d3c54782efae86993a11b0cecded012a9f34b0961"

RPROVIDES:${PN} += "application() application(fcitx-configtool.desktop) application(fcitx-skin-installer.desktop) application(fcitx.desktop) fcitx fcitx(aarch-64) locale(ko;zh_CN;zh_SG) mimehandler(application/x-fskin)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash fcitx-branding ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libfcitx-config.so.4()(64bit) libfcitx-core.so.0()(64bit) libfcitx-utils.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) liblua5.4.so.5()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbfile.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
