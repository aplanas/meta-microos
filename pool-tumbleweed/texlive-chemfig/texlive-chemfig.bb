SUMMARY = "Draw molecules with easy syntax"
DESCRIPTION = "The package provides the command \\chemfig{<code>}, which draws \
molecules using the TikZ package. The <code> argument provides \
instructions for the drawing operation. While the diagrams \
produced are essentially 2-dimensional, the package supports \
many of the conventional notations for illustrating the \
3-dimensional layout of a molecule. The package uses TikZ for \
its actual drawing operations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6dsvn65912"

RPM_NAME = "texlive-chemfig-2023.209.1.6dsvn65912-54.1.noarch.rpm"
RPM_HASH = "988894121066cf7d3fb7b7a563a6f99bd630a8e4520ebe8a1b0c565c94fa10e5f37fd6f429c8e9a85b4cb7c8d71bb629c09a857312217e94b2275879485d984c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemfig-lewis.tex \
tex-chemfig.sty \
tex-chemfig.tex \
texlive-chemfig"

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
