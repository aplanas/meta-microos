SUMMARY = "Fcitx tools to make pinyin match list"
DESCRIPTION = "Tools to convert txt or scel(sougou pinyin data format) pinyin sheets to fcitx match lists."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-tools-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "1344f697b3fc37523b42f3130abb70ce13b1ae279ed3462de3fe0f81d9a58b114e0626da363d0d84cb5e0374588113d6c2eda8182063ee8d9fb732a071c30b42"

RPROVIDES:${PN} += "fcitx-pinyin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
