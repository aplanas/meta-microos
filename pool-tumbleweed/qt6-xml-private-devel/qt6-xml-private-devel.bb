SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-xml-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "44b5855d57877be12cc6790564ce280bcd028211f4ed0d9ef363d3e40a83e34f4572129dae035bb908765d959fafee5d10465849440d176d64d304902587ccc5"

RPROVIDES:${PN} += "qt6-xml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Xml \
qt6-core-private-devel"

inherit rpm
