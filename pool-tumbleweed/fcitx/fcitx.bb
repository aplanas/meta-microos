SUMMARY = "Flexible Context-aware Input Tool with eXtension"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "05d73162b2ceac69221b0200494c5f11961d16a260c31904b800196f4244f143781e0b91d3f173bb47bf36ac2064458340c0acb134fe2486fdb56e67912b29f5"

RPROVIDES:${PN} += "fcitx \
locale-ko;zh-CN;zh-SG"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
fcitx-branding \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libfcitx-config.so.4 \
libfcitx-core.so.0 \
libfcitx-utils.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
liblua5.4.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libuuid.so.1 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
libxml2.so.2"

inherit rpm
