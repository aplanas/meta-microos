SUMMARY = "Styles for various Physics Journals (old version)"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0asvn56589"

RPM_NAME = "texlive-revtex4-2023.201.4.0asvn56589-53.2.noarch.rpm"
RPM_HASH = "00a0f691debbf845ac0eea01fed600edfcb9091cdf5ced879e14aae86862156fe63228e0045b2474eb8989327bd8afe6a37bc4abe2364a2f5a3a76096fcf7e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-10pt.rtx \
tex-11pt.rtx \
tex-12pt.rtx \
tex-aps.rtx \
tex-revsymb.sty \
tex-revtex4.cls \
tex-rmp.rtx \
texlive-revtex4"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-natbib.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
