SUMMARY = "Examples for the qt6-positioning module"
DESCRIPTION = "Examples for the qt6-positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "12e2c1b3d744244734e60c70928347f5ed1d11f47167a030a3216ee83fea0f809eb5e76001f1cdc35e990f1c276d28748cc7c79819dedfc21fc0796619e3ece6"

RPROVIDES:${PN} += "qt6-location-examples \
qt6-positioning-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
