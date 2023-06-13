SUMMARY = "DictSym font and macro package"
DESCRIPTION = "This directory contains the DictSym Type1 font designed by \
Georg Verweyen and all files required to use it with LaTeX on \
the Unix or PC platforms. The font provides a number of symbols \
commonly used in dictionaries. The accompanying macro package \
makes the symbols accessible as LaTeX commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-dictsym-2023.201.svn20031-52.1.noarch.rpm"
RPM_HASH = "4ae0e7d8eb34d893f93315657459aca6004af5ef6fabf98a2187467b4903681011e4408704966fcf70a0081555810436fbb78bf0883bc02714e5a3f010bc6fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dictsym.map) \
tex(dictsym.sty) \
tex(dictsym.tfm) \
texlive-dictsym"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
tex(pifont.sty) \
tex(updmap.cfg) \
texlive \
texlive-dictsym-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
