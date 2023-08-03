SUMMARY = "A Chicago style for BibLaTeX"
DESCRIPTION = "Windy City is a style for BibLaTeX that formats notes, \
bibliographies, parenthetical citations, and reference lists \
according to the 17th edition of The Chicago Manual of Style."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61223"

RPM_NAME = "texlive-windycity-2023.209.svn61223-54.1.noarch.rpm"
RPM_HASH = "5f4fd62267fc7b1de75547a1441770862b01e078bb0c436d5c13f750e3f63a4d5d66bfeeaec3e8c0f359252ec2f68fb6039751b2197680e6b67256b77a77a6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-windycity.lbx \
tex-windycity.bbx \
tex-windycity.cbx \
tex-windycity.sty \
texlive-windycity"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-babel.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-btxdockit.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-helvet.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
