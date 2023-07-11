SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-2023.201.4.1ssvn56590-53.2.noarch.rpm"
RPM_HASH = "3a321b2b158b6f075c93f90057d38a664212dee07de4b927deb4ab018552863c885e59813006841b8f601b5ff2a00fe3262bca9cbb53c157b4e8bd941d256d23"
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
