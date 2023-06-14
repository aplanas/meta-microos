SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python310-qpageview-0.6.2-1.5.noarch.rpm"
RPM_HASH = "0a2fafee37b030d7a1ed1ddb770cf8718ad06d8fd380e0b29ac631e6d3bc37682b44185bb17b768e744b6c820c00f05d09cd8997cc4c713ce36d74ab9c2d0c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qpageview \
python3.10dist-qpageview \
python310-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python310-poppler-qt5 \
python310-qt5"

inherit rpm
