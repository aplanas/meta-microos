SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachineQml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7aac14763a0caedf5fb0c6d29280f096f2ade3f5b3cfdd01eec0f71c96bcd6105cfb161ca2adb3b5811a50a5f676bf9f135c04c77037c9167e3d71df4942fe14"

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
