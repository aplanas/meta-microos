SUMMARY = "Insert nonbreakable spaces, using encTeX"
DESCRIPTION = "The package provides tools for inserting nonbreakable spaces \
after nonsyllabic prepositions and single letter conjunctions \
as required by Czech and Slovak typographical rules. It is \
implemented using encTeX and provides files both for plain TeX \
and LaTeX. The LaTeX solution tries to avoid conflicts with \
other packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34087"

RPM_NAME = "texlive-encxvlna-2023.201.1.1svn34087-53.2.noarch.rpm"
RPM_HASH = "c3f1eb8ec3bca3eab3a12c89d17b7e15fdf34539dff32b176a2c6d74a50790e6d9883ec2f55d95137d9b9edc2cd22f159a76372f34927486142eeb5bcae08640"
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
