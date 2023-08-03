SUMMARY = "Layout graphic rich documents"
DESCRIPTION = "The pagelayout class enables you to layout pages declaratively \
using simple macros for pages, covers, grids, templates, text, \
and graphics to create graphic rich, perfectly typeset, and \
print ready PDFs. The integration of Inkscape allows your to \
create box shadows. The integration of ImageMagick allows you \
to configure compression and sharpening for bitmap graphics to \
export web, print or preview versions of your document. \
Parallelized image optimization, caching, and a draft mode \
enable fast PDF creation and a responsive workflow, even for \
large documents with lots of photos and graphics. The \
pagelayout class also integrates the Pgf/TikZ and tcolorbox \
LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn66392"

RPM_NAME = "texlive-pagelayout-2023.209.1.0.4svn66392-52.1.noarch.rpm"
RPM_HASH = "36c73a59d0b0cc272cdcaa784c6e43925e749b3192c754ce36a74b3d6842413ed2d72101e2cb26395812a2a8050efa95163e327ddaf299f9c8cf602dac9e1df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagelayout.cls \
texlive-pagelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-standalone.cls \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pagelayout-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
