SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-xml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "18481fd9e0a2f9b9c2cecceab598b58b3a1fddaab34ad1f294211d6389c2578439e56f00b04f9e5a7bf345eedb38c2eeaab53c542ac4c704798249ad073a9641"

RPROVIDES:${PN} += "qt6-xml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Xml \
qt6-core-private-devel"

inherit rpm
