SUMMARY = "LaTeX document class for the International Journal of Student Research in Archaeology"
DESCRIPTION = "This is a document class called ijsra which is used for the \
International Journal of Student Research in Archaeology."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44886"

RPM_NAME = "texlive-ijsra-2023.209.1.1svn44886-54.1.noarch.rpm"
RPM_HASH = "e9e603327bac98cd03195093fb84fdac87539b9f9085bbd3aa6e5109e10052bcf6629ce506521d0d58f19db4976a6c501360d0fce3cf189f56b9b722348b1762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ijsra.cls \
texlive-ijsra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abbrevs.sty \
tex-alertmessage.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-chngcntr.sty \
tex-cleveref.sty \
tex-colortbl.sty \
tex-currfile-abspath.sty \
tex-currfile.sty \
tex-draftfigure.sty \
tex-enumerate.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-filecontents.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-lettrine.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-nth.sty \
tex-paralist.sty \
tex-pdfpages.sty \
tex-scrhack.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-url.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
