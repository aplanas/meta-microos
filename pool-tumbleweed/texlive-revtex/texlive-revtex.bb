SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "Includes styles for American Physical Society, American \
Institute of Physics, and Optical Society of America. The \
distribution consists of the RevTeX class itself, and several \
support packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2esvn56591"

RPM_NAME = "texlive-revtex-2023.201.4.2esvn56591-53.2.noarch.rpm"
RPM_HASH = "1249bcf817843e9abae43bdbfc349f74b6e9a765d1a1d87e933b65a9a8ef462de6e9e6fd079b69da71634126db23507c0b789b5fc81ba2899327de068f5bcc03"
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
