SUMMARY = "Documentation for texlive-mptopdf"
DESCRIPTION = "This package includes the documentation for texlive-mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65952"

RPM_NAME = "texlive-mptopdf-doc-2023.201.svn65952-54.1.noarch.rpm"
RPM_HASH = "ce4432b5864bfaeda2b7f76c203ee7ac5c2667685919367a404fd3ab839dfe52909916b4e6b0eec74621c48f80b605c186db73a4fd670bbde77d1f5d377de7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(mptopdf.1) \
texlive-mptopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
