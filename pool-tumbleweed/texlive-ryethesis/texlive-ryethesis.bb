SUMMARY = "Class for Ryerson Unversity Graduate School requirements"
DESCRIPTION = "The class offers support for formatting a thesis, dissertation \
or project according to Ryerson University's School of Graduate \
Studies thesis formatting regulations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.36svn33945"

RPM_NAME = "texlive-ryethesis-2023.209.1.36svn33945-54.1.noarch.rpm"
RPM_HASH = "26ffbf8d25cd3ff528e6191a833e1d0be069d5603530cf9dfb08d3ad755d61904ca09e760fb786fb8e6c6fdecb1acc468b1d332ac45c7547ecc3f0924252cbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ryethesis.cls \
texlive-ryethesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-glossaries.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-nomencl.sty \
tex-setspace.sty \
tex-vmargin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
