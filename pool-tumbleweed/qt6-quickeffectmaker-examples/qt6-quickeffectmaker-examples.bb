SUMMARY = "Examples for the qt6-quickeffectmaker modules"
DESCRIPTION = "Examples for the qt6-quickeffectmaker modules."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dbe93e45a96bb7237291448ff0080016e8669311cc8be9992e99461980ab078417a3d2449663e4ad59040501cdf2944e3de902d7075d912900d014025cbe4291"

RPROVIDES:${PN} += "qt6-quickeffectmaker-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
