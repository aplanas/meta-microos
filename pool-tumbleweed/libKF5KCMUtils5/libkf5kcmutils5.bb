SUMMARY = "Classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5KCMUtils5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "2f19c6cc11bf4b78505f7ab8b1e8db0d2cbc05ed083c7152979eadef1a188db4ddc39713900c38d52788a59029ba05b9546ec9266d23aa4e9238da2a6617773b"

RPROVIDES:${PN} += "libKF5KCMUtils.so.5 \
libKF5KCMUtils5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Auth.so.5 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtilsCore.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
