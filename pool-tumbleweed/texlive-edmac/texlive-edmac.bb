SUMMARY = "Typeset critical editions"
DESCRIPTION = "This is the type example package for typesetting scholarly \
critical editions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.17svn61719"

RPM_NAME = "texlive-edmac-2023.209.3.17svn61719-54.1.noarch.rpm"
RPM_HASH = "965c6b7eb46c175f8e83338b4ce7ce091e1c9482194bca3ea3f42da3b2afc9602118c19779617bb2d705fc4ebd91fecadc5a4f44aed30a83e9ef5ae40dd5511b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edmac.tex \
tex-edmacfss.sty \
tex-edstanza.tex \
tex-tabmac.tex \
texlive-edmac"

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
