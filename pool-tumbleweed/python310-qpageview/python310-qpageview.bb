SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python310-qpageview-0.6.2-1.7.noarch.rpm"
RPM_HASH = "39fc4cae81bfb1a561b2f57c90b090be5a995cff9f289756c15cb597f3c62c065544ba7dd0163544a84877a0ef4846e101afded595fc0cd514f5e413cc400700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qpageview \
python310-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python310-poppler-qt5 \
python310-qt5"

inherit rpm
