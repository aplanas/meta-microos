SUMMARY = "Decorative swelled rule using font character"
DESCRIPTION = "The package implements a decorative swelled rule using only a \
symbol from a font installed with all distributions of TeX, so \
it works independently, without the need to install any \
additional software or fonts. This is the packaged version of \
the macro which was originally published in the 'Typographers' \
Inn' column in TUGboat 31:1 (2010)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn55230"

RPM_NAME = "texlive-decorule-2023.209.0.0.7svn55230-53.1.noarch.rpm"
RPM_HASH = "e466f6b4295607eb454e5bd1f65083a992074c11486b22d887044a5027b680211478e4350360c654d1787ff336617096befe58cc1c8d0a220470479e0da23846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decorule.sty \
texlive-decorule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fix-cm.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
