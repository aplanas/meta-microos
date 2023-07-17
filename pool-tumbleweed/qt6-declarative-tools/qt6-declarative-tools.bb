SUMMARY = "Qt 6 Declarative Tools"
DESCRIPTION = "Additional tools for inspecting, testing, viewing QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-tools-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "3dcf0efc59c4585871fdae5704f44daee790862cf4586183d62c35abdb21209a11ca492d15d7690b9c1f415688ea7049abe173f9f7d8b9b0524c3846b6c5e641"

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
