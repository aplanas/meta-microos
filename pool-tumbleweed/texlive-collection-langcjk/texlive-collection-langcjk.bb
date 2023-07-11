SUMMARY = "Chinese/Japanese/Korean (base)"
DESCRIPTION = "Packages supporting a combination of Chinese, Japanese, Korean, \
including macros, fonts, documentation. Also Thai in the c90 \
encoding, since there is some overlap in those fonts; standard \
Thai support is in collection-langother. Additional packages \
for CJK are in their individual language collections."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65824"

RPM_NAME = "texlive-collection-langcjk-2023.208.svn65824-60.1.noarch.rpm"
RPM_HASH = "b3f8cf5981d8d745bcd375df5d75d92ccb1d38a613a396b2106669e31b4f21c10669f03e31b22978df231606589cf413d342db327fb6385950703e5c8f6af158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langcjk"

RDEPENDS:${PN} += "texlive-adobemapping \
texlive-c90 \
texlive-cjk \
texlive-cjk-gs-integrate \
texlive-cjkpunct \
texlive-cjkutils \
texlive-collection-basic \
texlive-dnp \
texlive-evangelion-jfm \
texlive-fixjfm \
texlive-garuda-c90 \
texlive-jfmutil \
texlive-norasi-c90 \
texlive-pxtatescale \
texlive-xcjk2uni \
texlive-xecjk \
texlive-zitie \
texlive-zxjafont"

inherit rpm
