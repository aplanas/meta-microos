SUMMARY = "Documentation for texlive-pst-eucl"
DESCRIPTION = "This package includes the documentation for texlive-pst-eucl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.75svn56474"

RPM_NAME = "texlive-pst-eucl-doc-2023.209.1.75svn56474-53.1.noarch.rpm"
RPM_HASH = "feb0457b9fe9a92c161cd23833229bb6db5f6b96f37182a0d91fceaf08109ef68e727ebd1d532c677a78ca852cc95a629144c9167b7b7060672ed39e7ab3c78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-eucl-doc-en \
texlive-pst-eucl-doc"

RDEPENDS:${PN} += ""

inherit rpm
