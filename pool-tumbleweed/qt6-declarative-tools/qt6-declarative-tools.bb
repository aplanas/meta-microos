SUMMARY = "Qt 6 Declarative Tools"
DESCRIPTION = "Additional tools for inspecting, testing, viewing QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-tools-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7fe53885f5f721fd00132c31dbb686f5b2a960cac5dbbbfcc0d6984a1ad8b653ca209e533d6065d4a22a0450300eb987389fecb9d0b76bbd8b4f41b4e0a401d5"

RPROVIDES:${PN} += "libqmldbg_debugger.so()(64bit) \
libqmldbg_debugger.so(Qt_6)(64bit) \
libqmldbg_inspector.so()(64bit) \
libqmldbg_inspector.so(Qt_6)(64bit) \
libqmldbg_local.so()(64bit) \
libqmldbg_local.so(Qt_6)(64bit) \
libqmldbg_messages.so()(64bit) \
libqmldbg_messages.so(Qt_6)(64bit) \
libqmldbg_native.so()(64bit) \
libqmldbg_native.so(Qt_6)(64bit) \
libqmldbg_nativedebugger.so()(64bit) \
libqmldbg_nativedebugger.so(Qt_6)(64bit) \
libqmldbg_preview.so()(64bit) \
libqmldbg_preview.so(Qt_6)(64bit) \
libqmldbg_profiler.so()(64bit) \
libqmldbg_profiler.so(Qt_6)(64bit) \
libqmldbg_quickprofiler.so()(64bit) \
libqmldbg_quickprofiler.so(Qt_6)(64bit) \
libqmldbg_server.so()(64bit) \
libqmldbg_server.so(Qt_6)(64bit) \
libqmldbg_tcp.so()(64bit) \
libqmldbg_tcp.so(Qt_6)(64bit) \
libquicklintplugin.so()(64bit) \
libquicklintplugin.so(Qt_6)(64bit) \
qt6-declarative-tools \
qt6-declarative-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6JsonRpc.so.6()(64bit) \
libQt6JsonRpc.so.6(Qt_6)(64bit) \
libQt6LanguageServer.so.6()(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6QmlCompiler.so.6()(64bit) \
libQt6QmlCompiler.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickTest.so.6()(64bit) \
libQt6QuickTest.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt6-declarative-imports"

inherit rpm
