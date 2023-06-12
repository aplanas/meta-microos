SUMMARY = "Qt 5 API Documentation"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package pulls in the API documentation in HTML and QCH format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-5.15.9-2.1.noarch.rpm"
RPM_HASH = "bd8a5f919e4afc0c6be4e0136411bbeeee2e5bc369889e3973a896ffebc891d6509550ad7aba96c05e5744746928a6f7ca74e2b18ae092d75c734c380e479fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtcharts-docs \
libqt5-qtdatavis3d-docs \
libqt5-qtdoc"
RDEPENDS:${PN} += "libqt5-qtdoc-html \
libqt5-qtdoc-qch"

inherit rpm
