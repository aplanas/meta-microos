SUMMARY = "Documentation for texlive-bangorcsthesis"
DESCRIPTION = "This package includes the documentation for texlive-bangorcsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.5svn61770"

RPM_NAME = "texlive-bangorcsthesis-doc-2023.201.1.5.5svn61770-53.1.noarch.rpm"
RPM_HASH = "1613d56d5e2ff72dc89f31370e4b159bcc13376d5ce7eff0bc5df8d18cc86c5608e0993fcbb8b6ab42fae3b7913b89f31702445803455549450ef79949504539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorcsthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
