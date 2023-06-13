SUMMARY = "Qt 5 Declarative Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde25"

RPM_NAME = "libQtQuick5-5.15.9+kde25-1.1.aarch64.rpm"
RPM_HASH = "818dee92fb6220ca98f54aafd01816dba19d0c841a5625b780be9aa41bcd0cad7e25b78a07c09183019e833f6637ac02866d6883172e406337e357c05c86ad70"

RPROVIDES:${PN} += "libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QmlModels.so.5()(64bit) \
libQt5QmlModels.so.5(Qt_5)(64bit) \
libQt5QmlWorkerScript.so.5()(64bit) \
libQt5QmlWorkerScript.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickParticles.so.5()(64bit) \
libQt5QuickShapes.so.5()(64bit) \
libQt5QuickTest.so.5()(64bit) \
libQt5QuickTest.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQtQuick5 \
libQtQuick5(aarch-64) \
liblabsanimationplugin.so()(64bit) \
liblabsmodelsplugin.so()(64bit) \
libmodelsplugin.so()(64bit) \
libparticlesplugin.so()(64bit) \
libqmldbg_debugger.so()(64bit) \
libqmldbg_inspector.so()(64bit) \
libqmldbg_local.so()(64bit) \
libqmldbg_messages.so()(64bit) \
libqmldbg_native.so()(64bit) \
libqmldbg_nativedebugger.so()(64bit) \
libqmldbg_preview.so()(64bit) \
libqmldbg_profiler.so()(64bit) \
libqmldbg_quickprofiler.so()(64bit) \
libqmldbg_server.so()(64bit) \
libqmldbg_tcp.so()(64bit) \
libqmlfolderlistmodelplugin.so()(64bit) \
libqmllocalstorageplugin.so()(64bit) \
libqmlplugin.so()(64bit) \
libqmlsettingsplugin.so()(64bit) \
libqmlshapesplugin.so()(64bit) \
libqmlwavefrontmeshplugin.so()(64bit) \
libqquicklayoutsplugin.so()(64bit) \
libqtqmlstatemachine.so()(64bit) \
libqtquick2plugin.so()(64bit) \
libsharedimageplugin.so()(64bit) \
libwindowplugin.so()(64bit) \
libworkerscriptplugin.so()(64bit)"

RDEPENDS:${PN} += "(qml-autoreqprov if rpm-build) \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
