SUMMARY = "Documentation for texlive-yquant"
DESCRIPTION = "This package includes the documentation for texlive-yquant"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-doc-2023.209.0.0.7.3svn65933-53.1.noarch.rpm"
RPM_HASH = "2ae69150a6c4ce4968e2e7729d1d23b6f0e067ddea7eb8349cb6e8599cc281fde4cd2cdad9ed474ff54cde26c9d85d254ab1a8d4622a39220aae8cebbb7a83df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yquant-doc"

RDEPENDS:${PN} += ""

inherit rpm
