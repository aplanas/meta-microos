SUMMARY = "Documentation for texlive-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-churchslavonic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn42751"

RPM_NAME = "texlive-churchslavonic-doc-2023.209.0.0.2.1svn42751-54.1.noarch.rpm"
RPM_HASH = "8e24bdace1c29f044490ea05a9a263700287ab4088de0fc5842de5f84abbe23b51a3b906ee22e4f469589387b308287869822e3b8756a73170f807b3e04f37a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-churchslavonic-doc-ru \
texlive-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm
