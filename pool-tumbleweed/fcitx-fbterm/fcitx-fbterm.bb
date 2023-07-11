SUMMARY = "Fbterm Support for Fcitx"
DESCRIPTION = "Fcitx-fbterm is a Wrapper for Fcitx in fbterm, a fast Framebuffer based terminal emulator."
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "fcitx-fbterm-0.2.0-7.29.aarch64.rpm"
RPM_HASH = "2b9c9a93529be151e70a792ef9f89e23dea962a860801f8b5c2679ff31b63f89fb325719c9f5701646341cf3382322af9127cde993fa1929b397ff65218e8a22"

RPROVIDES:${PN} += "fcitx-fbterm \
locale-fbterm-ko;zh-CN;zh-SG"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libfcitx-gclient.so.1 \
libfcitx-utils.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
