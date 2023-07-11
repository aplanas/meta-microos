SUMMARY = "QDoc index files and doxygen tag files for Qt 5 API Documentation"
DESCRIPTION = "This package contains the QDoc index files and the doxygen tag files to create cross links between the QCH documentation files. This package is normally not \
required."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-devel-5.15.9-2.3.noarch.rpm"
RPM_HASH = "bbabbdcc7d9ef16233b7f4b45ea8f4f09ff14a953ede1248e638b31525713f6db79920892eab122bedee3123747508daafe05abfb384209f69260a80f7ebf36c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-devel"

RDEPENDS:${PN} += "doxygen \
libqt5-qttools"

inherit rpm
