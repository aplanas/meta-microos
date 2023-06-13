SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python311-qpageview-0.6.2-1.5.noarch.rpm"
RPM_HASH = "d2395224f587c9865c4f2cabe2af535aaa9804feb12d68a05a01109c3fd43b24a2d47e2e1796c134cd4dca6d67397173e0d02b456a16a60438bb0b946cb6970a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qpageview) \
python311-qpageview \
python3dist(qpageview)"

RDEPENDS:${PN} += "python(abi) \
python311-poppler-qt5 \
python311-qt5"

inherit rpm
