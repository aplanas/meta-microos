SUMMARY = "The Mozc backend for Fcitx 5"
DESCRIPTION = "The Mozc backend for Fcitx 5 provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "2.29.5111.102"

RPM_NAME = "fcitx5-mozc-2.29.5111.102-1.1.aarch64.rpm"
RPM_HASH = "0708c83a0d6b1a97c697f23f66dcf5a125e72a354bcd1aec3f31285712b4c574b41686579f239ce4bea3052394fd4e6256520b2748ced84b05e3fcdacbe9ee4f"

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
