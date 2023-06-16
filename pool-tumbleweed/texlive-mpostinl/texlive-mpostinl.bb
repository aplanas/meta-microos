SUMMARY = "Embed MetaPost figures within LaTeX documents"
DESCRIPTION = "This LaTeX2e package enables the embedding of MetaPost figures \
within LaTeX documents. The package automatically collects the \
embedded definitions and figures in a .mp file, adds an \
appropriate LaTeX document structure, and compiles it to .mps \
files. It also allows for various configuration options to \
manage the generation of files and compilation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn49559"

RPM_NAME = "texlive-mpostinl-2023.201.1.5svn49559-54.1.noarch.rpm"
RPM_HASH = "6158ccca00fbeaaed4913cb7a8f396224a445fb380375342250dc0eb34be167044be15bf63f87a9292720d0dc5fd7502bc4dbee071e174bfd69c7a35ab8398ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpostinl.sty \
texlive-mpostinl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
