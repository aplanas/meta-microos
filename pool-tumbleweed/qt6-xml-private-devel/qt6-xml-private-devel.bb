SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-xml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b7e987b692e034ee78c8ab1bde78f35d35e8ba0e648aa0084d42b4aff86c6d2ca82146ecf37c20f8f872fcd56a2af4bab08f6649979d5361368303985dd929a0"

RPROVIDES:${PN} += "qt6-xml-private-devel \
qt6-xml-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Xml) \
qt6-core-private-devel"

inherit rpm
