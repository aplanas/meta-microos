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

PV = "2023.201.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-2023.201.1.0.17svn51431-52.1.noarch.rpm"
RPM_HASH = "f94de5871807fb0c2929644e8011769486bbe3315ef490199561f75fbfbb4b6fd356671c9661892719e1a0d2bdb8877dba97ffec0d54d04ed635b74a8ae8071b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tlc-article.cls \
texlive-tlc-article"

RDEPENDS:${PN} += "/bin/sh \
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
