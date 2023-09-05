SUMMARY = "Chinese Pinyin engine for fcitx"
DESCRIPTION = "Chinese Pinyin engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "3c3d8865e456cdecf9029bbe25383c12939ec6836e4f5696d299e4be88c6ca741349e7e4bbe0aedc5d56665dc9d57e673bc7b8197313fa9a18b99318f8b192c9"

RPROVIDES:${PN} += "fcitx-pinyin"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
