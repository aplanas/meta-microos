SUMMARY = "Fixes kashida feature in xepersian package"
DESCRIPTION = "The kashida feature in xepersian has problems with some fonts \
such as the HM Series fonts and the XB Series fonts. This \
package fixes these problems. The package requires xepersian \
and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-2023.201.1.1asvn56272-52.2.noarch.rpm"
RPM_HASH = "0941b1586056c95b8c28ae0a271ddd4fa3a61e27aec2f93ec860ce3d5d014d8929c4ff85f6c81ad0ed2aa09cf587dfa767d09899b7d5b5f89eed3de51c666bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xepersian-hm-common-kashida.tex \
tex-xepersian-hm-kashida.tex \
tex-xepersian-hm.sty \
texlive-xepersian-hm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-xcolor.sty \
tex-xepersian.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
