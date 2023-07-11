SUMMARY = "ROCS Graph Theory IDE main component library"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "librocsgraphtheory0-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "dfd83ed3c704555c26b58cdee4389174109b2703621bb1b6d552f0668355474ad65ffcd4dd2e8046cf05b67631abe57d2ae7fc8d64b14cfd20a833fd0072754f"

RPROVIDES:${PN} += "librocsgraphtheory.so.0 \
librocsgraphtheory0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
