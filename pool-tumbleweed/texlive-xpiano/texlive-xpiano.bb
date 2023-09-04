SUMMARY = "An extension of the piano package"
DESCRIPTION = "This package provides macros for typesetting virtual keyboards \
limited to two octaves for showing notes represented by a \
colored circle. Optionally, the number used for pitch analysis \
can be shown. It is an extension of piano.sty by Emile \
Daneault, written in expl3 in answer to a couple of questions \
on TeX.StackExchange: \
https://tex.stackexchange.com/questions/162184/ \
https://tex.stackexchange.com/questions/246276/. It features \
extended syntax and several options, like setting the color, \
adding numbers for pitch analysis, one or two octaves, and \
others."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-xpiano-2023.209.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "90d585034a080fcf3ff6bef626ab0a1b2db01355cb89670fb174c0e39c507b641e58bd7af27db1ec9a10cd337e2b54e134a7a7f733dccd17ccabf5254d1c1986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpiano.sty \
texlive-xpiano"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
