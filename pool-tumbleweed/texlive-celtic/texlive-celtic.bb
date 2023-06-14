SUMMARY = "A TikZ library for drawing celtic knots"
DESCRIPTION = "The package provides a TikZ library for drawing celtic knots."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn39797"

RPM_NAME = "texlive-celtic-2023.201.1.1svn39797-52.1.noarch.rpm"
RPM_HASH = "7a927b4f665a9aaf21b039020fa74a9f2fd7363bcf5eda9b64d047d6b665f0812b549a53dd01c04a0988b49e868d3aa4d97638954281b1830f98b6168ae0d706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryceltic.code.tex \
texlive-celtic"

RDEPENDS:${PN} += "/bin/sh \
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
