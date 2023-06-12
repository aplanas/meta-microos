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

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-xpiano-2023.201.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "8997b3466616658d8a5ed9f966132b053943f6f8b3125064b916828359f3609bcff5200c9582afdd0687a531a6fae8b65878bcdfeeef9a4777b3030e741d2ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xpiano.sty) \
texlive-xpiano"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
