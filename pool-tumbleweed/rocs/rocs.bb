SUMMARY = "Graph Theory IDE"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "rocs-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "9c49d6b42a2b80da36e3fd77223dddaf0fdf7e9c63ad26b342f5916045e31a28d961947cc74b84e77176ff88572c759aee7bf655484c12d1a56faf3c3f6673d8"

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
