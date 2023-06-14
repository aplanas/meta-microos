SUMMARY = "SVG-based theme engine for Qt5 and Qt6"
DESCRIPTION = "Kvantum is an SVG-based theme engine for Qt, tuned to Plasma and LXQt, with an emphasis on elegance, usability and practicality. \
Its homepage is https://github.com/tsujan/Kvantum. \
 \
Kvantum also comes with extra themes that can be selected and activated by using Kvantum Manager. \
 \
This package provides Kvantum theme engine for Qt6."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-qt6-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "13dcae2cc18e3f0cc619daf0f4e5d1ba4347979addb09bd8a8667a753b0e1244f53f632e5be069cd761a57754c89806f887baf926a05f9fb34de86a3e304d035"

RPROVIDES:${PN} += "kvantum-qt6 \
libkvantum.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
