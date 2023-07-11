SUMMARY = "Libzhuyin Wrapper for Fcitx5"
DESCRIPTION = "Libzhuyin Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.12"

RPM_NAME = "fcitx5-zhuyin-5.0.12-1.4.aarch64.rpm"
RPM_HASH = "d02308ae425ea565e8d8791735919d23e1a983b07832dd1d6521148f005700d4e8014b5a0fa47943c02ed6b874a81cf0700a44ba0f498cf9fe01a8db39eb56ab"

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
