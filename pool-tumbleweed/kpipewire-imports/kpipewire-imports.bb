SUMMARY = "QtQuick bindings for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides QtQuick bindings for the main KPipeWire libraries."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "kpipewire-imports-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "3e1c281bf13cd1c63c46198ad0f109e5c055d633dc15ef6afeac88fcf06b996d874032db0bf614334eb09b6b83d2170bd1b08493f0908bb6255ef53d21799d59"

RPROVIDES:${PN} += "kpipewire-imports \
libKPipeWireDeclarative.so \
libKPipeWireRecordDeclarative.so \
qt5qmlimport-org.kde.pipewire.0 \
qt5qmlimport-org.kde.pipewire.record.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPipeWire.so.5 \
libKPipeWire5 \
libKPipeWireDmaBuf5 \
libKPipeWireRecord.so.5 \
libKPipeWireRecord5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
