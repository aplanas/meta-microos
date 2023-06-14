SUMMARY = "Qt 5 Declarative Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde25"

RPM_NAME = "libQtQuick5-5.15.9+kde25-1.1.aarch64.rpm"
RPM_HASH = "818dee92fb6220ca98f54aafd01816dba19d0c841a5625b780be9aa41bcd0cad7e25b78a07c09183019e833f6637ac02866d6883172e406337e357c05c86ad70"

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

RDEPENDS:${PN} += "-qml-autoreqprov if rpm-build \
/sbin/ldconfig \
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
