SUMMARY = "Documentation for texlive-hlist"
DESCRIPTION = "This package includes the documentation for texlive-hlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn44983"

RPM_NAME = "texlive-hlist-doc-2023.201.0.0.11svn44983-53.2.noarch.rpm"
RPM_HASH = "7f277ea1f49e25757ddf6e4486bad51649fa34b50230784fecbf475d935ca64b423e6846aaa3e45f129eb6efc527ec0c586d3f069a9ee3ff54d3cc227f380ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
