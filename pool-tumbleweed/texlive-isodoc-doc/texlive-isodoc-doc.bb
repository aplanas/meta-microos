SUMMARY = "Documentation for texlive-isodoc"
DESCRIPTION = "This package includes the documentation for texlive-isodoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn59709"

RPM_NAME = "texlive-isodoc-doc-2023.201.1.14svn59709-55.1.noarch.rpm"
RPM_HASH = "89923f44c0cf7652fa89bbfe41dacca7546c2aa55a070174500628f3641df54577576d990f99cbeef301cf64b81d97b7a10719c9cce61fd500e305b0dde136ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
