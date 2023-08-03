SUMMARY = "Manipulating generalized token lists"
DESCRIPTION = "The package provides tools for simple operations on lists of \
tokens which are not necessarily balanced. It is in particular \
used a lot in the unravel package, to go through tokens one at \
a time rather than having to work with entire braced groups at \
a time. The package requires up-to-date versions of the \
l3kernel, l3kpackages, and l3experimental bundles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn49527"

RPM_NAME = "texlive-gtl-2023.209.0.0.5svn49527-54.1.noarch.rpm"
RPM_HASH = "d1cd4b654fb9448e39773450adc63d037b4bcb1f9cd06e9d3b71e5146cdb89e15306a24456cb50405185031f8a008f159677b1736202efb8245270abacee1b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtl.sty \
texlive-gtl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
