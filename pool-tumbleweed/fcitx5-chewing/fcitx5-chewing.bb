SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-chewing-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "be9acad0724e2870a6b8a7ac6022d30e61917a5ce35883bc7a214cf7c1efb8f8c4f0810956d61ec3f37dadbeecbec1fc3d8ec4357c7b3fccaab7f454cef32521"

RPROVIDES:${PN} += "fcitx-chewing \
fcitx5-chewing \
libchewing.so"

RDEPENDS:${PN} += "chewing-data \
chewing-utils \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libchewing.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
