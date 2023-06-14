SUMMARY = "Qt 6 Declarative Tools"
DESCRIPTION = "Additional tools for inspecting, testing, viewing QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-tools-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7fe53885f5f721fd00132c31dbb686f5b2a960cac5dbbbfcc0d6984a1ad8b653ca209e533d6065d4a22a0450300eb987389fecb9d0b76bbd8b4f41b4e0a401d5"

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
