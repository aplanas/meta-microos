SUMMARY = "A BibLaTeX implementation of the GBT7714-2015 bibliography style for Chinese users"
DESCRIPTION = "This package provides an implementation of the GBT7714-2015 \
bibliography style. This implementation follows the \
GBT7714-2015 standard and can be used by simply loading \
BibLaTeX with the appropriate option. A demonstration database \
is provided to show how to format input for the style."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1ksvn64967"

RPM_NAME = "texlive-biblatex-gb7714-2015-2023.201.1.1ksvn64967-53.1.noarch.rpm"
RPM_HASH = "d3d67248f9c5c0f7c70e782c89ac075d4c162ecc26e2c582cb6a47f3e956a3364024493feee6f3f9ecbe7b83fd404323a3bf276137656d2afe4a67cac957df57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chinese-erj.bbx \
tex-chinese-erj.cbx \
tex-gb7714-1987.bbx \
tex-gb7714-1987.cbx \
tex-gb7714-1987ay.bbx \
tex-gb7714-1987ay.cbx \
tex-gb7714-2005.bbx \
tex-gb7714-2005.cbx \
tex-gb7714-2005ay.bbx \
tex-gb7714-2005ay.cbx \
tex-gb7714-2015-gbk.def \
tex-gb7714-2015.bbx \
tex-gb7714-2015.cbx \
tex-gb7714-2015ay.bbx \
tex-gb7714-2015ay.cbx \
tex-gb7714-2015ms.bbx \
tex-gb7714-2015ms.cbx \
tex-gb7714-2015mx.bbx \
tex-gb7714-2015mx.cbx \
tex-gb7714-CCNU.bbx \
tex-gb7714-CCNU.cbx \
tex-gb7714-NWAFU.bbx \
tex-gb7714-NWAFU.cbx \
tex-gb7714-SEU.bbx \
tex-gb7714-SEU.cbx \
texlive-biblatex-gb7714-2015"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-mfirstuc.sty \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
