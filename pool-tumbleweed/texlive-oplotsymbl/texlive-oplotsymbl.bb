SUMMARY = "Some symbols which are not easily available"
DESCRIPTION = "This package is named oPlotSymbl and it includes symbols, which \
are not easily available. Especially, these symbols are used in \
scientific plots, but the potential user is allowed to use them \
in other ways. This package uses TikZ and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-2023.209.1.4svn44951-55.1.noarch.rpm"
RPM_HASH = "27ce36612211c81daab8218c28b4978ba42151b5ac78b3b3d72e2633a6320f6064414535323227ebe9e790a423b45fedea7ade853bf77f34f186f6ff31647bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oplotsymbl.sty \
texlive-oplotsymbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
