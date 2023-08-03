SUMMARY = "A maths symbol font"
DESCRIPTION = "FdSymbol is a maths symbol font, designed as a companion to the \
Fedra family by Typotheque, but it might also fit other \
contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-2023.209.0.0.8svn61719-53.1.noarch.rpm"
RPM_HASH = "07c224c2eb684bb915526717679c43b2f43c739884a06732bda25f280cd82c6444ee50782a99d6615c1c6855c6531b076dab5b1f9001ff01459da80b99b41cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FdSymbolA-Bold.tfm \
tex-FdSymbolA-Book.tfm \
tex-FdSymbolA-Medium.tfm \
tex-FdSymbolA-Regular.tfm \
tex-FdSymbolB-Bold.tfm \
tex-FdSymbolB-Book.tfm \
tex-FdSymbolB-Medium.tfm \
tex-FdSymbolB-Regular.tfm \
tex-FdSymbolC-Bold.tfm \
tex-FdSymbolC-Book.tfm \
tex-FdSymbolC-Medium.tfm \
tex-FdSymbolC-Regular.tfm \
tex-FdSymbolD-Bold.tfm \
tex-FdSymbolD-Book.tfm \
tex-FdSymbolD-Medium.tfm \
tex-FdSymbolD-Regular.tfm \
tex-FdSymbolE-Bold.tfm \
tex-FdSymbolE-Book.tfm \
tex-FdSymbolE-Medium.tfm \
tex-FdSymbolE-Regular.tfm \
tex-FdSymbolF-Bold.tfm \
tex-FdSymbolF-Book.tfm \
tex-FdSymbolF-Medium.tfm \
tex-FdSymbolF-Regular.tfm \
tex-fdsymbol-a.enc \
tex-fdsymbol-b.enc \
tex-fdsymbol-c.enc \
tex-fdsymbol-d.enc \
tex-fdsymbol-e.enc \
tex-fdsymbol-f.enc \
tex-fdsymbol.map \
tex-fdsymbol.sty \
texlive-fdsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-fdsymbol-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
