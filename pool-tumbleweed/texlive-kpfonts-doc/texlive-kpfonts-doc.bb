SUMMARY = "Documentation for texlive-kpfonts"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.35svn65583"

RPM_NAME = "texlive-kpfonts-doc-2023.209.3.35svn65583-56.1.noarch.rpm"
RPM_HASH = "34a6216bfb8a722db200839a53bf63715439fd51a7ef6fcb73874a1a5078defd7707bb338baa3f74458a80f8b0ce9b756358f8cf136c3e4a4918100ebc6f6570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kpfonts-doc-en \
texlive-kpfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
