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

PV = "2023.201.1.71dsvn64976"

RPM_NAME = "texlive-easybook-2023.201.1.71dsvn64976-53.2.noarch.rpm"
RPM_HASH = "4bcf73fcfec33d5871cbc88f9ac6bcd7fc324d10e71da23b9e8082616bf448864482500eaded01abf506651370840c1389e4a1d0fcc813606ec83b76b1dbf2be"
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
