SUMMARY = "GrantleeTheme library for KDE PIM applications"
DESCRIPTION = "The GrantleeTheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5GrantleeTheme5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9c3a731ae055d61fd7c8b99e89516876ae5d03169b0fa233a2d3cc6bf339b5c8dcbde446febfe61ca199449e6ab64123944d363af2a152edb258c587c1a5a4ca"

RPROVIDES:${PN} += "libKPim5GrantleeTheme.so.5 \
libKPim5GrantleeTheme5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
