SUMMARY = "Graphical frontend for R language"
DESCRIPTION = "RKWard aims to provide an easily extensible, easy to use IDE/GUI for the \
R-project. RKWard tries to combine the power of the R-language with the \
(relative) ease of use of commercial statistics tools. Long term plans \
include integration with office suites"
LICENSE = "GPL-2.0-only"

PV = "0.7.5"

RPM_NAME = "rkward-0.7.5-1.6.aarch64.rpm"
RPM_HASH = "bc5a63737f0d54c90a9303b50424da434680c55a3412d63044f9f15bfbef07d4379e0d2149a45f95b5ac41deac6091571416287235825665ad96be907f694717"

RPROVIDES:${PN} += "rkward"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextEditor.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libR.so \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
