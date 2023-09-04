SUMMARY = "High-level hex editor/viewer framework libraries"
DESCRIPTION = "Kasten is a WIP higher-level framework for composable document-centric \
applications."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "libKasten4-0.26.13-1.1.aarch64.rpm"
RPM_HASH = "a4b27874913fbcc5bdc2a8fc5d8ab62c41b087049cf79577d312846cd65b0f6b3802f595dafd1eafecf3f1505552d8a1b8b88658790d81baf8948d859baff9bd"

RPROVIDES:${PN} += "libKasten4 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Gui.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libkasten"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libqca-qt5.so.2 \
libstdc++.so.6 \
okteta-data"

inherit rpm
