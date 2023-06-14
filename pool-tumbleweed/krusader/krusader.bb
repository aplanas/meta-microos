SUMMARY = "Twin panel file manager for KDE Plasma and other desktops"
DESCRIPTION = "Krusader is an advanced twin panel (commander style) file manager for KDE Plasma \
and other desktops in the *nix world."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "krusader-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "09872ecb5959fac8aa8f952371f9247055d80ae47d219fb8243193ad1e8397804b217a0644bc2528b436ddcb10449a1a9fae2247537c65cdf758675656c20b4f"

RPROVIDES:${PN} += "krusader"

RDEPENDS:${PN} += "kio-iso \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
