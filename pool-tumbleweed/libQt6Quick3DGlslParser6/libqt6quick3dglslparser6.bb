SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DGlslParser6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f7eab31a9283565cce0e927fbd5b778a1be8a958e878afc200676134c594427ca65b108e475162da3223039a9411ce8cd2010c48655f0c02b597d39c16afb6f1"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6()(64bit) \
libQt6Quick3DGlslParser.so.6(Qt_6)(64bit) \
libQt6Quick3DGlslParser6 \
libQt6Quick3DGlslParser6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
