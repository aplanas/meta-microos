SUMMARY = "Easily typesetting Chinese theses or books"
DESCRIPTION = "easybook is a pure academic template created based on the \
ctexbook book document class. It also has the functions of book \
and article document class. Combined with the general framework \
design of the dissertation of many universities in China, \
providing multiple commands and interfaces allows users to \
easily customize the thesis template. Its basic macro package \
easybase can also be used with CTeX and standard document \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.71dsvn64976"

RPM_NAME = "texlive-easybook-2023.209.1.71dsvn64976-54.2.noarch.rpm"
RPM_HASH = "d6e11c3c28c3876ac8bf49bd993faa3bf4df9ec8e4051c6525a230bf752576d349c504b050b4345ef3ad4bebbbf7eef0b9e73ac104e06664e53e2f23cec60aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easybase.sty \
tex-easybook.cls \
tex-eb-tcolorbox.cfg \
texlive-easybook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctex.sty \
tex-ctexbook.cls \
tex-etoolbox.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
