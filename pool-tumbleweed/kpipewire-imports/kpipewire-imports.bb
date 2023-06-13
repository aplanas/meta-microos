SUMMARY = "QtQuick bindings for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides QtQuick bindings for the main KPipeWire libraries."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "kpipewire-imports-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "28933b78687ff0bc4278e55a451c8d9667075b1b73cae90ea723e526ab6a1679f51868fd911428b0da1a10df9647b94bf01690215f45c7749664c67990bf518d"

RPROVIDES:${PN} += "kpipewire-imports \
kpipewire-imports(aarch-64) \
libKPipeWireDeclarative.so()(64bit) \
libKPipeWireRecordDeclarative.so()(64bit) \
qt5qmlimport(org.kde.pipewire.0) \
qt5qmlimport(org.kde.pipewire.record.0)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKPipeWire.so.5()(64bit) \
libKPipeWire5 \
libKPipeWireDmaBuf5 \
libKPipeWireRecord.so.5()(64bit) \
libKPipeWireRecord5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
