SUMMARY = "Typeset critical editions"
DESCRIPTION = "This is the type example package for typesetting scholarly \
critical editions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.17svn61719"

RPM_NAME = "texlive-edmac-2023.201.3.17svn61719-53.2.noarch.rpm"
RPM_HASH = "b8e7475af8f6207f228cda89854af835959d4b089b526664e6601ca28e299b660e57324bf463677230cb0a78fb827e72db1902279dff854bb56b5fc4ef55ded5"
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
