SUMMARY = "Typeset critical editions"
DESCRIPTION = "This is the type example package for typesetting scholarly \
critical editions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.17svn61719"

RPM_NAME = "texlive-edmac-2023.209.3.17svn61719-54.2.noarch.rpm"
RPM_HASH = "f530f4fe906894af7eb1f24ed83f369d6f524661d3190bc692f815a904778327aaffef4849a3f3263630620f4e4a89829d7a10ac6b69d64d60da8f1305a44a64"
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
