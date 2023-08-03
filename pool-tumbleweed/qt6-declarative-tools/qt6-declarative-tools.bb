SUMMARY = "Qt 6 Declarative Tools"
DESCRIPTION = "Additional tools for inspecting, testing, viewing QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-tools-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d856fc862bf3c9a3a5faec44f6edb50fc835135d94952cd8cbae39dd63abb2e0429c6f6d0a2df74f611393161250fe2aacfc11236da7896381256c086ebad17c"

RPROVIDES:${PN} += "libqmldbg-debugger.so \
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
libquicklintplugin.so \
qt6-declarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6JsonRpc.so.6 \
libQt6LanguageServer.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QmlCompiler.so.6 \
libQt6Quick.so.6 \
libQt6QuickTest.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
