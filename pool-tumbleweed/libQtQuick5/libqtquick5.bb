SUMMARY = "Qt 5 Declarative Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde26"

RPM_NAME = "libQtQuick5-5.15.10+kde26-1.1.aarch64.rpm"
RPM_HASH = "5a0db6e34d7fc3a8400fdbea28898273cf7330a2874aca87b2150b2faf1638a98192d3db17a7431d78809fd63e0ce37d9c4a1d14c385111c1cf3be781e7a0602"

RPROVIDES:${PN} += "libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5QmlWorkerScript.so.5 \
libQt5Quick.so.5 \
libQt5QuickParticles.so.5 \
libQt5QuickShapes.so.5 \
libQt5QuickTest.so.5 \
libQt5QuickWidgets.so.5 \
libQtQuick5 \
liblabsanimationplugin.so \
liblabsmodelsplugin.so \
libmodelsplugin.so \
libparticlesplugin.so \
libqmldbg-debugger.so \
libqmldbg-inspector.so \
libqmldbg-local.so \
libqmldbg-messages.so \
libqmldbg-native.so \
libqmldbg-nativedebugger.so \
libqmldbg-preview.so \
libqmldbg-profiler.so \
libqmldbg-quickprofiler.so \
libqmldbg-server.so \
libqmldbg-tcp.so \
libqmlfolderlistmodelplugin.so \
libqmllocalstorageplugin.so \
libqmlplugin.so \
libqmlsettingsplugin.so \
libqmlshapesplugin.so \
libqmlwavefrontmeshplugin.so \
libqquicklayoutsplugin.so \
libqtqmlstatemachine.so \
libqtquick2plugin.so \
libsharedimageplugin.so \
libwindowplugin.so \
libworkerscriptplugin.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
