SUMMARY = "Documentation for texlive-docbytex"
DESCRIPTION = "This package includes the documentation for texlive-docbytex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34294"

RPM_NAME = "texlive-docbytex-doc-2023.209.svn34294-53.1.noarch.rpm"
RPM_HASH = "31d2cabf29870503b0385acd37e8c2861f29842c094102e1b16226bce53433dbf0390cd840de0f582b0e5c6eb6159b09bd15f57afa80515be5ea6042d172965a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-docbytex-doc-cs \
texlive-docbytex-doc"

RDEPENDS:${PN} += ""

inherit rpm
