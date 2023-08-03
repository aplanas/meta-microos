SUMMARY = "Styles for various Physics Journals (old version)"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0asvn56589"

RPM_NAME = "texlive-revtex4-2023.209.4.0asvn56589-54.1.noarch.rpm"
RPM_HASH = "e6a6d11ef3ea6a9c58e7d35b515796a32707c2869fa22784538087502c6012616313b9229d5dc0beb7d3685f0b7978f11deac7769a9acf7def5efb230fd8b062"
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
