SUMMARY = "Cite all entries of a bbl created with BibLaTeX"
DESCRIPTION = "This small package allows to cite all entries of a bbl-file \
created with BibLaTeX (v1.9)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn45975"

RPM_NAME = "texlive-citeall-2023.209.1.4svn45975-54.1.noarch.rpm"
RPM_HASH = "476a1bd418430357d79b3dcc1af8d87e2dcda94a1f7016217edfa6d313ec3916929bcf6342db7a0ca3b56c4e1ea2db663932cac612efa18286bed9fb22b2c08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeall.sty \
texlive-citeall"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
