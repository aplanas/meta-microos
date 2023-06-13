SUMMARY = "Fcitx tools to make pinyin match list"
DESCRIPTION = "Tools to convert txt or scel(sougou pinyin data format) pinyin sheets to fcitx match lists."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-pinyin-tools-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "8c3f1c72f09b686b1ca62f053492e87f8ae98c8ef7a23da5fee8c4d96babb5fa02c42aaab363d291288e7a636af8cf9a0c076d11225f052a320cc10abbe36b56"

RPROVIDES:${PN} += "fcitx-pinyin-tools \
fcitx-pinyin-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit)"

inherit rpm
