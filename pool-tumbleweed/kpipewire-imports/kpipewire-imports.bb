SUMMARY = "QtQuick bindings for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides QtQuick bindings for the main KPipeWire libraries."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "kpipewire-imports-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a6f3f599539c288f9453b6560d810991b97a429492a519da1f1ab8c793593e672724c53f732a1b6232e6a1939bd0a481ef7d89a2059f6df28a106e6bc7f0a9fd"

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
