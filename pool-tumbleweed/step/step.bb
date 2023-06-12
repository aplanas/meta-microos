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

RPROVIDES:${PN} += "application() \
application(org.kde.step.desktop) \
metainfo() \
metainfo(org.kde.step.appdata.xml) \
mimehandler(application/x-step) \
step \
step(aarch-64) \
step5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Plotting.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqalculate.so.22()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
