SUMMARY = "LaTeX document class for the International Journal of Student Research in Archaeology"
DESCRIPTION = "This is a document class called ijsra which is used for the \
International Journal of Student Research in Archaeology."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44886"

RPM_NAME = "texlive-ijsra-2023.201.1.1svn44886-52.1.noarch.rpm"
RPM_HASH = "cc6a4dce67fc0d3ed460c6f6267848864985fb4309cb547f3b0fe2c3beb2c47ce843d9d68010940c5f350987efdd883b6cdf26adc4a7c41b54943fabe1b75c70"
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
