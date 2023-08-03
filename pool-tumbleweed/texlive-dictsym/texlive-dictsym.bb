SUMMARY = "DictSym font and macro package"
DESCRIPTION = "This directory contains the DictSym Type1 font designed by \
Georg Verweyen and all files required to use it with LaTeX on \
the Unix or PC platforms. The font provides a number of symbols \
commonly used in dictionaries. The accompanying macro package \
makes the symbols accessible as LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-dictsym-2023.209.svn20031-53.1.noarch.rpm"
RPM_HASH = "138d2c3f96401ebc783458db553ca2ae2a3e99b4e16170dddaa76851b8f5f9b76f13a6013f74d240e43911cfb248dadf514158fddc9b322934683e3496095a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dictsym.map \
tex-dictsym.sty \
tex-dictsym.tfm \
texlive-dictsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pifont.sty \
tex-updmap.cfg \
texlive \
texlive-dictsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
