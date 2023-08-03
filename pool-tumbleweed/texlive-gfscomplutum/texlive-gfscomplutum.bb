SUMMARY = "A Greek font with a long history"
DESCRIPTION = "GFS Complutum derives, via a long development, from a \
minuscule-only font cut in the 16th century. An unsatisfactory \
set of majuscules were added in the early 20th century, but its \
author died before he could complete the revival of the font. \
The Greek Font Society has released this version, which has a \
new set of majuscules."
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-2023.209.1.0svn19469-53.1.noarch.rpm"
RPM_HASH = "9ec19c794c866beb2578f3885fb6c225cb6c28265540f41bcd18943d8bf10d711f00ebff4254b99912c9b894a7610698efde21204762b1f6a01afec5bcb459ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcomplutum8a.tfm \
tex-gcomplutum8a.vf \
tex-gcomplutum8r.tfm \
tex-gcomplutumo8a.tfm \
tex-gcomplutumo8a.vf \
tex-gcomplutumo8r.tfm \
tex-gfscomplutum.map \
tex-gfscomplutum.sty \
tex-gpcomplutum.enc \
tex-lgrcomplutum.fd \
texlive-gfscomplutum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfscomplutum-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
