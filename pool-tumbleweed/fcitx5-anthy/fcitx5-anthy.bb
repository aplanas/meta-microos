SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-anthy-5.0.14-1.1.aarch64.rpm"
RPM_HASH = "c167b152002174d0bc1e82442ee0de881ab46cca8347e8949d8d6f120bc68faaf09cade0707e8774becdcd4866c5c0c2c595758303283a2fab881be6e3579004"

RPROVIDES:${PN} += "fcitx-anthy \
fcitx5-anthy \
fcitx5-anthy(aarch-64) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Anthy.metainfo.xml)"

RDEPENDS:${PN} += "anthy \
fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libanthy.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
