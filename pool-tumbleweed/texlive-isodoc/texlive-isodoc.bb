SUMMARY = "A LaTeX class for typesetting letters and invoices"
DESCRIPTION = "The isodoc class can be used for the preparation of letters and \
invoices (and, in the future, similar documents). Documents are \
set up with options, thus making the class easily adaptable to \
user's wishes and extensible for other document types. The \
class is based on the NTG brief class by Victor Eijkhout, which \
implements the NEN1026 standard."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn59709"

RPM_NAME = "texlive-isodoc-2023.201.1.14svn59709-55.1.noarch.rpm"
RPM_HASH = "3398e84ecfc5960f2417a24383eacc93d005cad15610d0047819263469b6a48fd0f74d3cfaf10f194400b59a9c652c95fce69139d9a357666b4d4dc36ebdb9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isodoc.cls \
texlive-isodoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyhdr.sty \
tex-forarray.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-longtable.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-tabularx.sty \
tex-textpos.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
