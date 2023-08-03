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

RPM_NAME = "texlive-easybook-2023.209.1.71dsvn64976-54.1.noarch.rpm"
RPM_HASH = "f0c2805e49366dd221bd3cd352a5c14a5b143ba008e5932fad0c95c3f32256f43a2fdc2205d208344396ebca44f315574392565d84760a77b93c5035bdaaffa6"
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
