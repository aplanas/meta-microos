SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6StateMachineQml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c93c18e0b74efc3aebf11256960842ab2abf33e42ee8a089d06dd3a0c7eed6cc40dbfa334da1dbfb9a0eb48846eeea10f46b4cb25233c36e1d8989aa61e2f381"

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
