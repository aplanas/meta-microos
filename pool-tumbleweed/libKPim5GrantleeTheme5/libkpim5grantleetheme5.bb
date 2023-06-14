SUMMARY = "GrantleeTheme library for KDE PIM applications"
DESCRIPTION = "The GrantleeTheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5GrantleeTheme5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2f52f008fab3062c08939946e80e58a3f8f32cdc354f8f39819319a152f95895ee7012394218e71ef97d71e3aba35c55e34cdbe808b5d4e3bcf37bfcedd6cd55"

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
