SUMMARY = "Examples for the qt6-positioning module"
DESCRIPTION = "Examples for the qt6-positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b3ff320d13c1ab44589f5d17381f6970665a2c09d9b48c852bc3597d6f429f13b0f6ca341c4e80e9c3706d4bce948a838c7376581889f0af909d7317bf1b815f"

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
