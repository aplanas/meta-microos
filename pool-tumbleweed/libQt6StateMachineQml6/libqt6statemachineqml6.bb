SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachineQml6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "5eb6986318b137868da85576d67187be50abb224a0ab171156b8c8f53dd32cbecb877f7df9e5777cac2f797ecce2aa1070402f1e9ed7a8c522c42ee60dc6761e"

RPROVIDES:${PN} += "libQt6StateMachineQml.so.6 \
libQt6StateMachineQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6StateMachine.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
