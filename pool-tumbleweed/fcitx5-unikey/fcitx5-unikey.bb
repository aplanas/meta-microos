SUMMARY = "Unikey engine support for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-unikey-5.0.11-2.3.aarch64.rpm"
RPM_HASH = "1cfbc35b86ffdaa4807b14b8b9098e4033ff6c974e4f56913700543e7eef5b4ddd2ef524db49ac92cdb74c3243d67fd7d4c6f7ce34a3a988f192acc745f5c3b5"

RPROVIDES:${PN} += "fcitx-unikey \
fcitx5-unikey \
fcitx5-unikey(aarch-64) \
libfcitx5-unikey-keymap-editor.so()(64bit) \
libfcitx5-unikey-macro-editor.so()(64bit) \
libunikey.so()(64bit) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Unikey.metainfo.xml)"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Qt5WidgetsAddons.so.2()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
