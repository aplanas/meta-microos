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

RPM_NAME = "texlive-easybook-2023.201.1.71dsvn64976-53.1.noarch.rpm"
RPM_HASH = "3252f5edfce28b7e454f80daefb57233af1795e1ae1e2e4f6c49ce8519384e7807fce373a3b5a0a18894d1db292ff85ceeeb84bb4eb0eaa27169d86d9e905e37"
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
