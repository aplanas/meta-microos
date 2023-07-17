SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6ScxmlQml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cb40afb892535e847046c1d5a23ccc7bcf4409752f04e5f98d86d90b53c7b6a2e50fe62b2997572865c15b0ffc21b4638e226b8b3980fc89d31345f45535ce15"

RPROVIDES:${PN} += "libQt6ScxmlQml.so.6 \
libQt6ScxmlQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Scxml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
