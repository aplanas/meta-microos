SUMMARY = "An interactive physics simulator"
DESCRIPTION = "Step is an interactive physical simulator. The user first places some \
bodies on the scene, add some forces such as gravity or springs. When \
the simulation is run, Step shows how the scene will evolve according \
to the laws of physics. Every property of bodies/forces in the \
experiment may be changed, even during simulation."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "step-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ffb06fb07d265ce02716f6d8b4caeb5385195999bec625e9194d962f682a86d5a9de5c8448abf9e3bf574a3a28a09682bdced197ddf58af2a2eeed6f3c0cbffb"

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
