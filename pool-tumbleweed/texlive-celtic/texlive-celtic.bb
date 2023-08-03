SUMMARY = "A TikZ library for drawing celtic knots"
DESCRIPTION = "The package provides a TikZ library for drawing celtic knots."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn39797"

RPM_NAME = "texlive-celtic-2023.209.1.1svn39797-53.1.noarch.rpm"
RPM_HASH = "8ee4b40f1771f60a1d13db1e062282929a49628f4b15aa7438a0632b63f11d405e304ba0cd395a234ec7b0b766527c448e9f05eafb7563b0dd1d663afbd5d853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryceltic.code.tex \
texlive-celtic"

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
