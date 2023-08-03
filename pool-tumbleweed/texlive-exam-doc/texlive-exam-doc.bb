SUMMARY = "Documentation for texlive-exam"
DESCRIPTION = "This package includes the documentation for texlive-exam"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn64134"

RPM_NAME = "texlive-exam-doc-2023.209.2.7svn64134-53.1.noarch.rpm"
RPM_HASH = "c01c3bb5cc3a2ecf6c9f19b38d53b779b52436b972ea77d360cfa0d78131c478639a25d4a167ec564132fadcb2c1092c07ea5b40f3ae8f76142886e9b5c4cf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
