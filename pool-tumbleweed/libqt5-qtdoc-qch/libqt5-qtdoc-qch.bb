SUMMARY = "Qt 5 API Documentation in QCH format"
DESCRIPTION = "This package contains the Qt API Documentation in QCH format, which can be used by tools like KDevelop, Qt Assistant, Qt Creator, etc."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-qch-5.15.9-2.3.noarch.rpm"
RPM_HASH = "3a751fc57b776ba68400753cc00ee7e177b67d16f1a2261a6b427114b2b957965f37fdcaefe9180b329cbf66a230336cbbc81e07648d3a9f5c730b89196aee57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-qch"

RDEPENDS:${PN} += ""

inherit rpm
