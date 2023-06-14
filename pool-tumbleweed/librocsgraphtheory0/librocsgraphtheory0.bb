SUMMARY = "ROCS Graph Theory IDE main component library"
DESCRIPTION = "Rocs is a Graph Theory IDE for helping professors to show the results \
of a graph algorithm and also helping students to do the algorithms. \
 \
Rocs has a scripting module, done in Qt Script, which interacts with \
the drawn graph and every change in the graph with the script is \
reflected on the drawn one."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "librocsgraphtheory0-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "786519e87ef1e9a1bc0bed5ea2f75efa1f2a3f6823e46a22cb5593ea01b4f9b6dc02c220ea4214a4cb51d2d28457c15ff6feab7bfcbd4b51695ebcbbdd43b3c5"

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
