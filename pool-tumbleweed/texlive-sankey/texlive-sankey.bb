SUMMARY = "Draw Sankey diagrams with TikZ"
DESCRIPTION = "This package provides macros and an environment for creating \
Sankey diagrams, i.e. flow diagrams in which the width of the \
arrows is proportional to the flow rate."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn61874"

RPM_NAME = "texlive-sankey-2023.209.3.0.1svn61874-54.1.noarch.rpm"
RPM_HASH = "f62e97333cb19a7e1a2b9b6a68d1295b08cce60c37742b164ad97ad5f4e2fd1b4a350120af3e5d365d0dee8d69e9d744d3151bebf2681a4f60209d7dfb9ba8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sankey-doc-preamble.sty \
tex-sankey.sty \
tex-tikzlibrarydubins.code.tex \
texlive-sankey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-cmap.sty \
tex-dtx-attach.sty \
tex-dtxdescribe.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-footnote.sty \
tex-geometry.sty \
tex-hypdoc.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-parskip.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
