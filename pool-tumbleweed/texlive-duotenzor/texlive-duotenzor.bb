SUMMARY = "Drawing package for circuit and duotensor diagrams"
DESCRIPTION = "This is a drawing package for circuit and duotensor diagrams \
within LaTeX documents. It consists of about eighty commands, \
calling on TikZ for support."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn18728"

RPM_NAME = "texlive-duotenzor-2023.201.1.00svn18728-52.1.noarch.rpm"
RPM_HASH = "3e25036d9e30ff2b4a490f7b1dbb941e89aa2bf001ae514309fc6e28de7989b1204376929f5e2e0220e792ddf37028ac21e4a1ea9cc9a109ee4dadec81e7b026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duotenzor.sty \
texlive-duotenzor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
