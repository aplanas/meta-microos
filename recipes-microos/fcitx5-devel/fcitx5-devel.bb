SUMMARY = "Development files for fcitx5"
DESCRIPTION = "This package provides development files for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.21"

RPM_NAME = "fcitx5-devel-5.0.21-1.3.aarch64.rpm"
RPM_HASH = "a3c55755aa7fa706e29a939c598d5af6b9b1a44801a39602f2ecad5c62479069e200b090b218c65ffce08af8b2634a9a26a42ce10f4a44ab5db9f5fee02d2194"

RPROVIDES:${PN} += "cmake(Fcitx5Config) cmake(Fcitx5Core) cmake(Fcitx5Module) cmake(Fcitx5ModuleClipboard) cmake(Fcitx5ModuleDBus) cmake(Fcitx5ModuleEmoji) cmake(Fcitx5ModuleNotificationItem) cmake(Fcitx5ModuleNotifications) cmake(Fcitx5ModuleQuickPhrase) cmake(Fcitx5ModuleSpell) cmake(Fcitx5ModuleTestFrontend) cmake(Fcitx5ModuleTestIM) cmake(Fcitx5ModuleUnicode) cmake(Fcitx5ModuleWayland) cmake(Fcitx5ModuleXCB) cmake(Fcitx5Utils) fcitx-devel fcitx5-devel fcitx5-devel(aarch-64) pkgconfig(Fcitx5Config) pkgconfig(Fcitx5Core) pkgconfig(Fcitx5Module) pkgconfig(Fcitx5Utils) rpm_macro(_fcitx5_addondir) rpm_macro(_fcitx5_datadir) rpm_macro(_fcitx5_imconfdir) rpm_macro(_fcitx5_libdir) rpm_macro(_fcitx5_libexecdir) rpm_macro(_fcitx5_qt5dir)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fcitx5 libFcitx5Config6 libFcitx5Core7 libFcitx5Utils2 pkgconfig(Fcitx5Config) pkgconfig(Fcitx5Core) pkgconfig(Fcitx5Utils)"

inherit rpm
