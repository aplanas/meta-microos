SUMMARY = "The Mozc backend for Fcitx 5"
DESCRIPTION = "The Mozc backend for Fcitx 5 provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.28.4715.102"

RPM_NAME = "fcitx5-mozc-2.28.4715.102-2.1.aarch64.rpm"
RPM_HASH = "9d324b55b636c9e835a78a4716b2881a4532c434a8c9d40605234cd24eac00b3aefb59e959eb26aec45517f1833dd3d1f00d6148e463a171aaa4641de300b60b"

RPROVIDES:${PN} += "fcitx5-mozc \
fcitx5-mozc(aarch-64) \
locale(fcitx5:ja)"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
mozc \
mozc-gui-tools"

inherit rpm
