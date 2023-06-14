SUMMARY = "Graph Theory IDE"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "rocs-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6154fa4a64a260f0f014b10a8442c42345e9deaa9909446853e6d6283bd55acca264ceeb7894e69a3d30818659a9fd795a63c789144461fb5bdd94a6fd05cbaf"

RPROVIDES:${PN} += "rocs \
rocs5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5Parts.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librocsgraphtheory.so.0 \
libstdc++.so.6"

inherit rpm
