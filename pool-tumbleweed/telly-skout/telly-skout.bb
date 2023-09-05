SUMMARY = "Kirigami TV guide"
DESCRIPTION = "Telly Skout is a convergent Kirigami TV guide. It shows the TV program for your \
favorite channels from TV Spielfilm or an XMLTV file."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "telly-skout-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9b652bfe9a79068338e242cf579aef239c70bd81dd27ecfea550ee48f53ca39128efb3ba5e9b911251e808e7ffdbd74440c35412d836380efdf9171ab796a991"

RPROVIDES:${PN} += "telly-skout"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
