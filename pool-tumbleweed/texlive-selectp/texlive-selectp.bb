SUMMARY = "Select pages to be output"
DESCRIPTION = "Defines a command \\outputonly, whose argument is a list of \
pages to be output. With the command present (before \
\\begin{document}), only those pages are output. This package \
was inspired by code published by Knuth in TUGboat 8(2) (July \
1987)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn20185"

RPM_NAME = "texlive-selectp-2023.209.1.0svn20185-54.1.noarch.rpm"
RPM_HASH = "7bd412c3316a354f2ec4022a03264506eccd49f066d30cf39fef781190a97c4b8d38353f4ddc1851c67fd5cd5e5d3d93ecea405e2bae5d6c489a3fc401407f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-selectp.sty \
texlive-selectp"

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
