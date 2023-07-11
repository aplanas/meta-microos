SUMMARY = "Googlepinyin module for fcitx"
DESCRIPTION = "fcitx-googlepinyin is a Googlepinyin module for fcitx."
LICENSE = "GPL-3.0+"

PV = "0.1.6"

RPM_NAME = "fcitx-googlepinyin-0.1.6-7.27.aarch64.rpm"
RPM_HASH = "e64f33440944a039357c8a215a9da6e8ed647587f206cc6b1a8a847c4800a66d7e9eb17f41f0e24dfff800e33ac07b87a37908aaed7e944a6e7e76e18e4c32bb"

RPROVIDES:${PN} += "fcitx-googlepinyin \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgooglepinyin.so.0"

inherit rpm
