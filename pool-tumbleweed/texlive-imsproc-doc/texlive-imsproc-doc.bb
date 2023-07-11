SUMMARY = "Documentation for texlive-imsproc"
DESCRIPTION = "This package includes the documentation for texlive-imsproc"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-doc-2023.208.0.0.1svn29803-53.1.noarch.rpm"
RPM_HASH = "431e209d7aa30f59a4ec92e7c4dda3d243833ebc69f47be4a923730ab1c63fb4cc37812795d06257156a3d1a7cf682dd9b64d1c5d98b94ca2df048a3844dac53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imsproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
