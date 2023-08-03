SUMMARY = "Typeset and cross-reference chemical schemes based on TikZ code"
DESCRIPTION = "The package provides a comfortable means of typesetting \
chemical schemes, and also offers automatic structure \
referencing."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn46723"

RPM_NAME = "texlive-chemschemex-2023.209.1.2svn46723-54.1.noarch.rpm"
RPM_HASH = "43d1d1b2f1c4c0eb1b98d4df692936262d6f9a80a20d17a01a2a4f70944bb53d3ef0769f534fdd9c3ab6d2e17caf46eea2fb150f938dd7523465ee2f3e959a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemschemex.sty \
texlive-chemschemex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancylabel.sty \
tex-graphicx.sty \
tex-suffix.sty \
tex-tikz.sty \
tex-xargs.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
