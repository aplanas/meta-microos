SUMMARY = "Qt 6 StateMachineQml library"
DESCRIPTION = "The Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachineQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a6f2cd59eb46f029d9e4967bfc1aaaed8748e222140b8ba1961b771d1ec2532bb0e25abe457656faf106e9da3fa7795d8f858ad2b18139b6b2b668fa23a3df2d"

RPROVIDES:${PN} += "libQt6StateMachineQml.so.6()(64bit) \
libQt6StateMachineQml.so.6(Qt_6)(64bit) \
libQt6StateMachineQml6 \
libQt6StateMachineQml6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6StateMachine.so.6()(64bit) \
libQt6StateMachine.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
