SUMMARY = "Chinese Pinyin engine for fcitx"
DESCRIPTION = "Chinese Pinyin engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "c129302259e1d46cb5b5d3c672726282a2e4be43789047426b0c930dbe86bf430a2aca36ac87dc120dc76af41ba2a56d74f1f6d1f323fea8cd935babfdc98d21"

RPROVIDES:${PN} += "fcitx-pinyin \
fcitx-pinyin(aarch-64)"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
