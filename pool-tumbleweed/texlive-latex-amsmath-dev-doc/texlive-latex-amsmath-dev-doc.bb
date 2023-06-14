SUMMARY = "Documentation for texlive-latex-amsmath-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-amsmath-dev"
LICENSE = "LPPL-1.0"

PV = "2023.201.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-amsmath-dev-doc-2023.201.20230501_pre_release_0svn64899-55.1.noarch.rpm"
RPM_HASH = "c9efe97e2d6cf87ab6ddb802ad22925c491f47b945eabfa569167afd3e4a59e2ad4034c27c5eaa91dd5491d8885f4bc43cb857d2641175052f6d96fca69d9f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-latex-amsmath-dev-doc-en \
texlive-latex-amsmath-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
