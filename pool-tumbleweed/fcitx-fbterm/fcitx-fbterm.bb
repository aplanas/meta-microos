SUMMARY = "Fbterm Support for Fcitx"
DESCRIPTION = "Fcitx-fbterm is a Wrapper for Fcitx in fbterm, a fast Framebuffer based terminal emulator."
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "fcitx-fbterm-0.2.0-7.28.aarch64.rpm"
RPM_HASH = "37d07e988116cb9b259bc0810d8ec1e05b1c7916f00231a02e3bb097e11abc8033c497bb8bbfa37a1ea42e2dfbb54fcbe87f15c2509de64e3119b185c0a7c07c"

RPROVIDES:${PN} += "fcitx-fbterm \
fcitx-fbterm(aarch-64) \
locale(fbterm:ko;zh_CN;zh_SG)"

RDEPENDS:${PN} += "/bin/bash \
libc.so.6()(64bit) \
libfcitx-gclient.so.1()(64bit) \
libfcitx-utils.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
