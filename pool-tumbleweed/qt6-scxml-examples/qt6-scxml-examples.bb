SUMMARY = "Examples for the qt6-scxml modules"
DESCRIPTION = "Examples for the qt6-scxml modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxml-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "752ba9efdcaaf35c681422a58b0b545394e160fc213f760c696b9f5949196b6c3bf09e8fecb1b0001e66bae20c3ea41c6bce273dfe95457303947c111c7dc4a4"

RPROVIDES:${PN} += "qt6-scxml-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libQt6StateMachine.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
