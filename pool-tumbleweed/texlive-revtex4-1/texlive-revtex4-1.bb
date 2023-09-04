SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-2023.209.4.1ssvn56590-54.2.noarch.rpm"
RPM_HASH = "1e5a40d39a541c76859786f933e5cc43fc0396ad47548ad27a6ef941b15934682a046a320d5be1c4a6d8844997814af88df0027470959cccdf211a1d010776a8"
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
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
