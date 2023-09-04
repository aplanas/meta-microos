SUMMARY = "Typeset 5.5' x 8' recipes for browsing or printing"
DESCRIPTION = "This is a LaTeX2e class for typesetting recipes. It is designed \
for typesetting one or two recipes per page, with dimensions of \
5.5' x 8.5'. The hyperlinked table of contents (ToC) and page \
numbers make browsing recipes convenient, and the pages can be \
joined together or printed two per sheet to normal letterpaper \
easily. The size was chosen to work in half-page 3-ring binder \
cover sheets."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37026"

RPM_NAME = "texlive-recipebook-2023.209.svn37026-54.2.noarch.rpm"
RPM_HASH = "269aaf0e4bb24e425fd7800a55b3a5b7cb7cc2152abdf1a7559bcfe7aeb7b1bb52f5f83bdf7a54111f2170e66d0d1fe10470261061b0067f312c0867b7cd0329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-RecipeBook.cls \
texlive-recipebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-anyfontsize.sty \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-datetime.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-gensymb.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-nicefrac.sty \
tex-parskip.sty \
tex-picture.sty \
tex-ragged2e.sty \
tex-scrextend.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-tgtermes.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
