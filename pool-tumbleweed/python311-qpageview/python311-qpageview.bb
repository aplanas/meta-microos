SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python311-qpageview-0.6.2-1.7.noarch.rpm"
RPM_HASH = "fc84a539dc353f866a6817cfdf8deed4898b2ec850dfe89b38f4e82f66d0aa31986f05e33536ee7302cc09dca854f561668eb6bbfa6bbc28a805b2b614e7d132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qpageview \
python3.11dist-qpageview \
python311-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python311-poppler-qt5 \
python311-qt5"

inherit rpm
