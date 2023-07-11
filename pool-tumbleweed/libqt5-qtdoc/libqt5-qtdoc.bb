SUMMARY = "Qt 5 API Documentation"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package pulls in the API documentation in HTML and QCH format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-5.15.9-2.3.noarch.rpm"
RPM_HASH = "a06d36c5fcad1490b79c5f1619e67f5b43a257b77958d1f077d85f429ef6376a4894cf93bdd6c3f77c017135f232823a5dae953b081da27b662ca789b6d9faec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtcharts-docs \
libqt5-qtdatavis3d-docs \
libqt5-qtdoc"

RDEPENDS:${PN} += "libqt5-qtdoc-html \
libqt5-qtdoc-qch"

inherit rpm
