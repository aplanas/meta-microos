SUMMARY = "German LaTeX package documentation"
DESCRIPTION = "The package provides helpers for German language package \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-2023.209.0.0.5svn16005-52.1.noarch.rpm"
RPM_HASH = "796bed754fb42642bc1db854a23094f622908153e6fdb32edad7a4986f67f7e46d1fb0012ce09e3da7263bc96c20558195945b7635749d46fc00e64e4d3d57b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pauldoc.sty \
texlive-pauldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontenc.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
