SUMMARY = "RPM macros for building PyQt packages"
DESCRIPTION = "This package provides some macros for using SIP v[456] to build PyQt[56] packages"
LICENSE = "WTFPL"

PV = "0.1"

RPM_NAME = "python-pyqt-rpm-macros-0.1-3.2.noarch.rpm"
RPM_HASH = "8e52894ee933db3c1dfbfc9d4cc14d26c90cc90a5856939e5ba65eadfbba3c8f85fdfc1cf95ab46a6dc718506275a6e76a7851891eca8dad01b8e2710398b98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyqt-rpm-macros \
rpm-macro--pyqt-datadir \
rpm-macro--pyqt-qmake \
rpm-macro-pyqt-build \
rpm-macro-pyqt-install \
rpm-macro-pyqt-install-examples \
rpm-macro-pyqt5-sipdir \
rpm-macro-pyqt6-sipdir \
rpm-macro-sip4-only \
rpm-macro-sip5-only"

RDEPENDS:${PN} += "fdupes \
python-rpm-macros"

inherit rpm
