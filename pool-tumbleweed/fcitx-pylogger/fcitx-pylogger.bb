SUMMARY = "A Fcitx Typo Tracking Tool"
DESCRIPTION = "fcitx-pylogger collects typo statitics data of pinyin with Fcitx. \
It records the cases you use `backspace` for typo correction. \
It won't upload any data in background but hosts them at \
~/.config/fcitx/pylog/pyedit.log \
Once you've collected 1000 items, you can send it to fcitx@gmx.com \
 \
It can work with Sunpinyin/Libpinyin/GooglePinyin. Thanks for your \
contribution to make fcitx a better world."
LICENSE = "GPL-2.0"

PV = "1.0"

RPM_NAME = "fcitx-pylogger-1.0-5.24.aarch64.rpm"
RPM_HASH = "b2d01bd75c28c6db4bd72a2b0653ce59d5a703416d984ac083714b7a8719e2808d7730b05eead1f78d5b16fbf38fe5bc53073da4e7e78cd5f36585146a81c79a"

RPROVIDES:${PN} += "fcitx-pylogger \
fcitx-pylogger(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6()(64bit)"

inherit rpm
