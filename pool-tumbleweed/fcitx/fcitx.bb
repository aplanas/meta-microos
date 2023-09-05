SUMMARY = "Flexible Context-aware Input Tool with eXtension"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "6d29132686bdc2b56e65330d5f2b406b6dd476082ce14bc01caf6164291a6baeee4e761d5a7b60d1c07c74e690b4ecd9ee382a6c2fc832135096b8eb7807debf"

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
