SUMMARY = "GrantleeTheme library for KDE PIM applications"
DESCRIPTION = "The GrantleeTheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5GrantleeTheme5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "365ae39d704f9ed5faec45f416ab3c07fd816ce2833e88e81b4f8acf1eb5a517df4d710f1b6e9f5311b582242a2d7e29b713dee62cf5e1d5d8073e73515c41b3"

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
