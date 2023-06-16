SUMMARY = "Many-featured Young tableaux and Young diagrams"
DESCRIPTION = "The package provides several functions for drawing Young \
tableaux and Young diagrams, extending the young and youngtab \
packages but providing lots more features. Skew and coloured \
tableaux are easy, and pgfkeys-enabled options are provided \
both at package load and configurably."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59580"

RPM_NAME = "texlive-ytableau-2023.201.1.4svn59580-52.1.noarch.rpm"
RPM_HASH = "c388ec505f9c51fb9a450f135b66b6b0f428a9c003c5ab2312d865b585fd8b144da794c290286843738c6d8af7085cb82c9f6b261ed53e81dee2d9214902de77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ytableau.sty \
texlive-ytableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
