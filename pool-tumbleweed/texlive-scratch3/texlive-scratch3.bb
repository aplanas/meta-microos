SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-2023.201.0.0.19svn61921-53.1.noarch.rpm"
RPM_HASH = "70363ee9e1800b01037d6f6d6157481aaf26d811c421ba6cafe1cfdae5692334fdc9ab18437d9db2f4ebc5408710214194052ddc40af1508241149f009267870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch3.sty \
texlive-scratch3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
