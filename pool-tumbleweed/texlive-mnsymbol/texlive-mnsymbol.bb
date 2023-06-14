SUMMARY = "Mathematical symbol font for Adobe MinionPro"
DESCRIPTION = "MnSymbol is a symbol font family, designed to be used in \
conjunction with Adobe Minion Pro (via the MinionPro package). \
Almost all of LaTeX and AMS mathematical symbols are provided; \
remaining coverage is available from the MinionPro font with \
the MinionPro package. The fonts are available both as Metafont \
source and as Adobe Type 1 format, and a comprehensive support \
package is provided. While the fonts were designed to fit with \
Minon Pro, the design should fit well with other renaissance or \
baroque faces: indeed, it will probably work with most fonts \
that are neither too wide nor too thin, for example Palatino or \
Times; it is known to look good with Sabon. There is no package \
designed to configure its use with any font other than Minion \
Pro, but (for example) simply loading mnsymbol after mathpazo \
will probably do what is needed."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-2023.201.1.4svn18651-54.1.noarch.rpm"
RPM_HASH = "1c9b3b768da8a90ac0c8afba954d1d3197a883bd2288af624b9d539c66cab946b3ec10650beb62b9ca0e7a0e0d9c0b5e81476bf5feb742658d57b244328e427a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MnSymbol.map \
tex-MnSymbol.sty \
tex-MnSymbolA-Bold10.tfm \
tex-MnSymbolA-Bold12.tfm \
tex-MnSymbolA-Bold5.tfm \
tex-MnSymbolA-Bold6.tfm \
tex-MnSymbolA-Bold7.tfm \
tex-MnSymbolA-Bold8.tfm \
tex-MnSymbolA-Bold9.tfm \
tex-MnSymbolA.enc \
tex-MnSymbolA10.tfm \
tex-MnSymbolA12.tfm \
tex-MnSymbolA5.tfm \
tex-MnSymbolA6.tfm \
tex-MnSymbolA7.tfm \
tex-MnSymbolA8.tfm \
tex-MnSymbolA9.tfm \
tex-MnSymbolB-Bold10.tfm \
tex-MnSymbolB-Bold12.tfm \
tex-MnSymbolB-Bold5.tfm \
tex-MnSymbolB-Bold6.tfm \
tex-MnSymbolB-Bold7.tfm \
tex-MnSymbolB-Bold8.tfm \
tex-MnSymbolB-Bold9.tfm \
tex-MnSymbolB.enc \
tex-MnSymbolB10.tfm \
tex-MnSymbolB12.tfm \
tex-MnSymbolB5.tfm \
tex-MnSymbolB6.tfm \
tex-MnSymbolB7.tfm \
tex-MnSymbolB8.tfm \
tex-MnSymbolB9.tfm \
tex-MnSymbolC-Bold10.tfm \
tex-MnSymbolC-Bold12.tfm \
tex-MnSymbolC-Bold5.tfm \
tex-MnSymbolC-Bold6.tfm \
tex-MnSymbolC-Bold7.tfm \
tex-MnSymbolC-Bold8.tfm \
tex-MnSymbolC-Bold9.tfm \
tex-MnSymbolC.enc \
tex-MnSymbolC10.tfm \
tex-MnSymbolC12.tfm \
tex-MnSymbolC5.tfm \
tex-MnSymbolC6.tfm \
tex-MnSymbolC7.tfm \
tex-MnSymbolC8.tfm \
tex-MnSymbolC9.tfm \
tex-MnSymbolD-Bold10.tfm \
tex-MnSymbolD-Bold12.tfm \
tex-MnSymbolD-Bold5.tfm \
tex-MnSymbolD-Bold6.tfm \
tex-MnSymbolD-Bold7.tfm \
tex-MnSymbolD-Bold8.tfm \
tex-MnSymbolD-Bold9.tfm \
tex-MnSymbolD.enc \
tex-MnSymbolD10.tfm \
tex-MnSymbolD12.tfm \
tex-MnSymbolD5.tfm \
tex-MnSymbolD6.tfm \
tex-MnSymbolD7.tfm \
tex-MnSymbolD8.tfm \
tex-MnSymbolD9.tfm \
tex-MnSymbolE-Bold10.tfm \
tex-MnSymbolE-Bold12.tfm \
tex-MnSymbolE-Bold5.tfm \
tex-MnSymbolE-Bold6.tfm \
tex-MnSymbolE-Bold7.tfm \
tex-MnSymbolE-Bold8.tfm \
tex-MnSymbolE-Bold9.tfm \
tex-MnSymbolE.enc \
tex-MnSymbolE10.tfm \
tex-MnSymbolE12.tfm \
tex-MnSymbolE5.tfm \
tex-MnSymbolE6.tfm \
tex-MnSymbolE7.tfm \
tex-MnSymbolE8.tfm \
tex-MnSymbolE9.tfm \
tex-MnSymbolF-Bold10.tfm \
tex-MnSymbolF-Bold12.tfm \
tex-MnSymbolF-Bold5.tfm \
tex-MnSymbolF-Bold6.tfm \
tex-MnSymbolF-Bold7.tfm \
tex-MnSymbolF-Bold8.tfm \
tex-MnSymbolF-Bold9.tfm \
tex-MnSymbolF.enc \
tex-MnSymbolF10.tfm \
tex-MnSymbolF12.tfm \
tex-MnSymbolF5.tfm \
tex-MnSymbolF6.tfm \
tex-MnSymbolF7.tfm \
tex-MnSymbolF8.tfm \
tex-MnSymbolF9.tfm \
tex-MnSymbolS-Bold10.tfm \
tex-MnSymbolS-Bold12.tfm \
tex-MnSymbolS-Bold5.tfm \
tex-MnSymbolS-Bold6.tfm \
tex-MnSymbolS-Bold7.tfm \
tex-MnSymbolS-Bold8.tfm \
tex-MnSymbolS-Bold9.tfm \
tex-MnSymbolS.enc \
tex-MnSymbolS10.tfm \
tex-MnSymbolS12.tfm \
tex-MnSymbolS5.tfm \
tex-MnSymbolS6.tfm \
tex-MnSymbolS7.tfm \
tex-MnSymbolS8.tfm \
tex-MnSymbolS9.tfm \
texlive-mnsymbol"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-eufrak.sty \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mnsymbol-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
