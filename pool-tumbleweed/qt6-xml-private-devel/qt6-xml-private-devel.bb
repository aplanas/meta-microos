SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-xml-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "7e9d03866e5f28ebe692b1c422c26f8eeb28286bb406d26139308fb5856b359ef7b994a146e1e486bbc7f9c1394c3560a60bb5c1181606298f4aabd25dcc549c"

RPROVIDES:${PN} += "qt6-xml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Xml \
qt6-core-private-devel"

inherit rpm
