SUMMARY = "Documentation for texlive-greek-fontenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-fontenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-doc-2023.209.2.2.1svn66513-54.1.noarch.rpm"
RPM_HASH = "efd5a45c20533bb55dc5e0d959d1d4452c5977a26bddfdc7eb33995296e5f3edc9adabda362cc25803a692ddf7b4ca0971a259e2320cb7ce2699860a0ad9e484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-fontenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
