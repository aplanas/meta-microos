SUMMARY = "Libzhuyin Wrapper for Fcitx5"
DESCRIPTION = "Libzhuyin Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.12"

RPM_NAME = "fcitx5-zhuyin-5.0.12-1.3.aarch64.rpm"
RPM_HASH = "7b5aff5e8ad8fb9aedfd518d0ba2570c6d4358ea9961a9a4378772589a319454f25388c27a8df46b52bce404652f1f32b5e607f13ffec0090dd6cd713386ffa9"

RPROVIDES:${PN} += "fcitx-zhuyin \
fcitx5-zhuyin"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libzhuyin.so.15"

inherit rpm
