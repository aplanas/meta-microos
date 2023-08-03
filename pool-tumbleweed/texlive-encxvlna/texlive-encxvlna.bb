SUMMARY = "Insert nonbreakable spaces, using encTeX"
DESCRIPTION = "The package provides tools for inserting nonbreakable spaces \
after nonsyllabic prepositions and single letter conjunctions \
as required by Czech and Slovak typographical rules. It is \
implemented using encTeX and provides files both for plain TeX \
and LaTeX. The LaTeX solution tries to avoid conflicts with \
other packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34087"

RPM_NAME = "texlive-encxvlna-2023.209.1.1svn34087-54.1.noarch.rpm"
RPM_HASH = "4f9105839b494972a613f86d930b9297c540ac4249108b29f0aa17b27c3eb5faf7111d5cf7ef96db4640258c1f49b1f7c18ee9891015c518145faccab56e1290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-encxvlna.sty \
tex-encxvlna.tex \
texlive-encxvlna"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
