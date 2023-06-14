SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-2023.201.4.1ssvn56590-53.1.noarch.rpm"
RPM_HASH = "652d9df23acfd2d55e97f7deeed8100486700a9c9d0da8acc3f73bdd935604ddcae7f6f520fba216ee35dea76f917e7d9f1e6b06df77c31ab4fcede8d52f1643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aip4-1.rtx \
tex-aps10pt4-1.rtx \
tex-aps11pt4-1.rtx \
tex-aps12pt4-1.rtx \
tex-aps4-1.rtx \
tex-apsrmp4-1.rtx \
tex-revsymb4-1.sty \
tex-revtex4-1.cls \
texlive-revtex4-1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fleqn.clo \
tex-hyperref.sty \
tex-lineno.sty \
tex-natbib.sty \
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
