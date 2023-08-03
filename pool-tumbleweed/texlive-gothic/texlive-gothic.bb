SUMMARY = "A collection of old German-style fonts"
DESCRIPTION = "A collection of fonts that reproduce those used in 'old German' \
printing and handwriting. The set comprises Gothic, Schwabacher \
and Fraktur fonts, a pair of handwriting fonts, Sutterlin and \
Schwell, and a font containing decorative initials. In \
addition, there are two re-encoding packages for Haralambous's \
fonts, providing T1, using virtual fonts, and OT1 and T1, using \
Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49869"

RPM_NAME = "texlive-gothic-2023.209.svn49869-54.1.noarch.rpm"
RPM_HASH = "ad7614c2ba2e1016e4bd0a7d46e9f685730682bd8d32021498ccaba0505d777d186d6d72fda511a6435f4aba0a2575708c587e6b63762dc7b338efe476fb62ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmfrak.tfm \
tex-schwell.tfm \
tex-suet14.tfm \
tex-yfrak.tfm \
tex-ygoth.tfm \
tex-yinit.tfm \
tex-ysmfrak.tfm \
tex-yswab.tfm \
texlive-gothic"

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
