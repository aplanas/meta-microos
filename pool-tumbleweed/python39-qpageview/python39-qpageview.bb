SUMMARY = "Widget to display page-based documents for Qt5/PyQt5"
DESCRIPTION = "Widget to display page-based documents for Qt5/PyQt5"
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "python39-qpageview-0.6.2-1.7.noarch.rpm"
RPM_HASH = "e86481706ef2e8ec25d6b8456e15dbd9649dc5d720a9768890dca9909c5181e71f60ec67316a98fd2d27ed16bb981cef9fbc6204f0af97a10ec5cdd900acf9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qpageview \
python39-qpageview \
python3dist-qpageview"

RDEPENDS:${PN} += "python-abi \
python39-poppler-qt5 \
python39-qt5"

inherit rpm
