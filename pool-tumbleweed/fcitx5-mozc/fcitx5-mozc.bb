SUMMARY = "The Mozc backend for Fcitx 5"
DESCRIPTION = "The Mozc backend for Fcitx 5 provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "fcitx5-mozc-2.29.5111.102-2.1.aarch64.rpm"
RPM_HASH = "624087c6691527c6a9be93c7fea39c67bf1a61a8957b60b20200d3af5382b4066e7f17e627e24f978debcc3dfc2f3c0248682447c04509a416bbcbee4461c1a8"

RPROVIDES:${PN} += "fcitx5-mozc \
locale-fcitx5-ja"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
mozc \
mozc-gui-tools"

inherit rpm
