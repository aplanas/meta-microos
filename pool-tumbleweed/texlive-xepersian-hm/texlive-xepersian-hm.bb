SUMMARY = "Fixes kashida feature in xepersian package"
DESCRIPTION = "The kashida feature in xepersian has problems with some fonts \
such as the HM Series fonts and the XB Series fonts. This \
package fixes these problems. The package requires xepersian \
and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-2023.201.1.1asvn56272-52.1.noarch.rpm"
RPM_HASH = "4ef87ee5615cde5ef96ff2dfddd445d9cc1fc5740b29d63ad3e8c40aac35785e0fee8bceb6a29e16af1f5c45c5f357b730e9f0c311eecfe4e3b4b57d65ca5965"
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
