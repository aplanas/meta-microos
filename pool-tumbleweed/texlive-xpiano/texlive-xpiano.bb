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

RPM_NAME = "texlive-xpiano-2023.209.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "c70be79e1cad367f2af300dc22c20052cf0ebd5b4e58da34aaa546ed3b5e5a6a646a8d1c90f2e1e70c3d33bdbfe64e7833ac8e1de55e1d261c503fb4aaa6c42f"
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
