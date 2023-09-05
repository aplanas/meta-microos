SUMMARY = "An interactive physics simulator"
DESCRIPTION = "Step is an interactive physical simulator. The user first places some \
bodies on the scene, add some forces such as gravity or springs. When \
the simulation is run, Step shows how the scene will evolve according \
to the laws of physics. Every property of bodies/forces in the \
experiment may be changed, even during simulation."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "step-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "37b1ebebff8a9346d1e445023b8f9259e245e515390d8b3abbc9abd6584a53ade932f46316c8e62be7dcfc31118ae65001922f920b37264819d10af7d3e6521a"

RPROVIDES:${PN} += "step \
step5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Plotting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libqalculate.so.22 \
libstdc++.so.6"

inherit rpm
