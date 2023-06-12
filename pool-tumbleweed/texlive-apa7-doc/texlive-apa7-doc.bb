SUMMARY = "Documentation for texlive-apa7"
DESCRIPTION = "This package includes the documentation for texlive-apa7"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn63974"

RPM_NAME = "texlive-apa7-doc-2023.201.2.16svn63974-54.1.noarch.rpm"
RPM_HASH = "8d558ccbe60d19830eefa1ce29ba147dcc3aed63c53ff309963721ed004fe61a582a613728c570b96ae821d28e0e208b21dfa70bf09f307fbf3fd975e23174a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa7-doc"
RDEPENDS:${PN} += ""

inherit rpm
