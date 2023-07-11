SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-anthy-5.0.14-1.2.aarch64.rpm"
RPM_HASH = "5ebffc346d5f5f25f678813bc7842ea6d18da1dd6fcdc727c25788fd3e8501e3f4f1154ea0fec1386d9bd0f1986740f0fd650dc7249db433a2934c79154d20da"

RPROVIDES:${PN} += "fcitx-anthy \
fcitx5-anthy"

RDEPENDS:${PN} += "anthy \
fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libanthy.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
