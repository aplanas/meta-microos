SUMMARY = "Documentation for texlive-mpostinl"
DESCRIPTION = "This package includes the documentation for texlive-mpostinl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn49559"

RPM_NAME = "texlive-mpostinl-doc-2023.201.1.5svn49559-54.1.noarch.rpm"
RPM_HASH = "61a3a5f9630bade9a5988681eb61faba3d9b44de311dfc114d2e567489e0a44bd8caca66be7efb3438346a53bfb44dc49d32d37e3eda12b8ec230c434334f7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpostinl-doc"

RDEPENDS:${PN} += ""

inherit rpm
