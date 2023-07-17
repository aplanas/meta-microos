SUMMARY = "Qt 6 StateMachine library"
DESCRIPTION = "The Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6StateMachine6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8786ceb7b8ae1e0f118291bf3191fcb8a0948154244eb333f84b50b89e85e48b781ba1c506e02136c7b363c719da31ef5b53b697706914f41ca8dfe7a69d7b09"

RPROVIDES:${PN} += "libQt6StateMachine.so.6 \
libQt6StateMachine6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
