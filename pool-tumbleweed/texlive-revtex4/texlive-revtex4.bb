SUMMARY = "Styles for various Physics Journals (old version)"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0asvn56589"

RPM_NAME = "texlive-revtex4-2023.209.4.0asvn56589-54.2.noarch.rpm"
RPM_HASH = "a39a34d20f5a467afeaa4bd206cc4c12b1123a60abd3b1a2dfeb060293762c92619bbf8b630148c39f93f68eacd2cd84e8ddc396fc7e51f411b519277d999168"
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
