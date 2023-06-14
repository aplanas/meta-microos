SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-anthy-5.0.14-1.1.aarch64.rpm"
RPM_HASH = "c167b152002174d0bc1e82442ee0de881ab46cca8347e8949d8d6f120bc68faaf09cade0707e8774becdcd4866c5c0c2c595758303283a2fab881be6e3579004"

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
