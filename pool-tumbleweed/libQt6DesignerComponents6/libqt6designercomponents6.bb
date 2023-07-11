SUMMARY = "Qt 6 DesignerComponents library"
DESCRIPTION = "The Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6DesignerComponents6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fe03e1d53f2162e29771cd20e231616673614eeae12a64328c766d0e4eac902b746af070cffd85ffb9fb678a32122b442a5cd69482e3bcf7d5bebd1b2692036c"

RPROVIDES:${PN} += "libQt6DesignerComponents.so.6 \
libQt6DesignerComponents6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
