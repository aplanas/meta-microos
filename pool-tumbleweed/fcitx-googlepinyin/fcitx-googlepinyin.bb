SUMMARY = "Googlepinyin module for fcitx"
DESCRIPTION = "fcitx-googlepinyin is a Googlepinyin module for fcitx."
LICENSE = "GPL-3.0+"

PV = "0.1.6"

RPM_NAME = "fcitx-googlepinyin-0.1.6-7.26.aarch64.rpm"
RPM_HASH = "92edb6c54a3c3e2c52a61e27b98f933bf2c94f61c63b85ce62bf0720ef44f8213ba5215c0a3eaa3fa97ff0a9f50680272121a7e95ba5d166cc3e545ff0ef3ed3"

RPROVIDES:${PN} += "fcitx-googlepinyin \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgooglepinyin.so.0"

inherit rpm
