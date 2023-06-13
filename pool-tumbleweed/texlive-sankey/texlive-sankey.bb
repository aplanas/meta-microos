SUMMARY = "Draw Sankey diagrams with TikZ"
DESCRIPTION = "This package provides macros and an environment for creating \
Sankey diagrams, i.e. flow diagrams in which the width of the \
arrows is proportional to the flow rate."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn61874"

RPM_NAME = "texlive-sankey-2023.201.3.0.1svn61874-53.1.noarch.rpm"
RPM_HASH = "ae235f4862827a19d9d3117929cc6c090f00a44da14745e36752054b3b5f5a9bc389c0cd537dad535a93bbc853f6c2f780b2e609e9f33c2716f71258785c8878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sankey-doc-preamble.sty) \
tex(sankey.sty) \
tex(tikzlibrarydubins.code.tex) \
texlive-sankey"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accsupp.sty) \
tex(babel.sty) \
tex(bookmark.sty) \
tex(cmap.sty) \
tex(dtx-attach.sty) \
tex(dtxdescribe.sty) \
tex(embedfile.sty) \
tex(enumitem.sty) \
tex(etoc.sty) \
tex(etoolbox.sty) \
tex(fancyvrb.sty) \
tex(fontenc.sty) \
tex(footnote.sty) \
tex(geometry.sty) \
tex(hypdoc.sty) \
tex(inputenc.sty) \
tex(listings.sty) \
tex(lmodern.sty) \
tex(microtype.sty) \
tex(parskip.sty) \
tex(siunitx.sty) \
tex(tikz.sty) \
tex(varioref.sty) \
tex(xcolor.sty) \
tex(xfp.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
