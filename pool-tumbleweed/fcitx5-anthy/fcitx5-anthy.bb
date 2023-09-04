SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-anthy-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "3c137609fd8845d57bed820dcaa805fa94e94bf381bc0badfced41f6e48f705a19b94f1213f2c441c72e5ee57b82d0737cdd78e186e196f381b7d755c183eb74"

RPROVIDES:${PN} += "fcitx-anthy \
fcitx5-anthy \
libanthy.so"

RDEPENDS:${PN} += "anthy \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
