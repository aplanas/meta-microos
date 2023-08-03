SUMMARY = "A LaTeX document class for formal documents"
DESCRIPTION = "The package provides a LaTeX document class that orchestrates a \
logical arrangement for document header, footer, author, \
abstract, table of contents, and margins. It standardizes a \
document layout intended for formal documents. The tlc_article \
GitHub repository uses a SCRUM framework adapted to standard \
GitHub tooling. tlc_article is integrated with Travis-ci.org \
for continuous integration and AllanConsulting.slack.com for \
centralized notification."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-2023.209.1.0.17svn51431-53.1.noarch.rpm"
RPM_HASH = "daca1005ac93fb1b912881e2ecc7e7398582182ca5aee55e0bc52234b1a94509d7139f372af204fef8cbfa716df2be29035c1c0ff163c21494e282795e76b9e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tlc-article.cls \
texlive-tlc-article"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-appendix.sty \
tex-array.sty \
tex-article.cls \
tex-bookmark.sty \
tex-csvsimple.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-makecell.sty \
tex-multicol.sty \
tex-pdflscape.sty \
tex-pdfpages.sty \
tex-spverbatim.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
