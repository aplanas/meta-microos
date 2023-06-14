SUMMARY = "Documentation for texlive-wrapstuff"
DESCRIPTION = "This package includes the documentation for texlive-wrapstuff"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-doc-2023.201.0.0.3svn64058-52.1.noarch.rpm"
RPM_HASH = "f13990940334778d75cccf06e5113b8b40262917e5e850b58e1b53d850f901726ab16b0223177e974da549369eb3bf41e928f30c03892ee5e4b1bfe728fd1ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wrapstuff-doc-zh \
texlive-wrapstuff-doc"

RDEPENDS:${PN} += ""

inherit rpm
