SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "Includes styles for American Physical Society, American \
Institute of Physics, and Optical Society of America. The \
distribution consists of the RevTeX class itself, and several \
support packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2esvn56591"

RPM_NAME = "texlive-revtex-2023.209.4.2esvn56591-54.2.noarch.rpm"
RPM_HASH = "5dafb6cb761369b02822fad540d5ef2c7ce221c9121e5ae719685867ddc22c2ae0bfa271febead352b9666eb597cd25ff1e64a5a81ceb5300fc99ab4f6bbea38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aapm4-2.rtx \
tex-aip4-2.rtx \
tex-aps10pt4-2.rtx \
tex-aps11pt4-2.rtx \
tex-aps12pt4-2.rtx \
tex-aps4-2.rtx \
tex-apsrmp4-2.rtx \
tex-ltxdocext.sty \
tex-ltxfront.sty \
tex-ltxgrid.sty \
tex-ltxutil.sty \
tex-reftest4-2.tex \
tex-revsymb4-2.sty \
tex-revtex4-2.cls \
tex-sor4-2.rtx \
texlive-revtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fleqn.clo \
tex-hyperref.sty \
tex-lineno.sty \
tex-natbib.sty \
tex-shortvrb.sty \
tex-textcase.sty \
tex-url.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
