SUMMARY = "A collection of packages by Francesco Bosisio"
DESCRIPTION = "A collection of packages containing: accenti dblfont; envmath; \
evenpage; graphfig; mathcmd; quotes; and sobolev."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16989"

RPM_NAME = "texlive-bosisio-2023.201.svn16989-52.1.noarch.rpm"
RPM_HASH = "56574b40d0ee5774d919b4af8b16ced23bb5f25f988c186a1904adca6f0fb6020fbcce3b00e46d9710f625eb9f1e5592b8111826a5d675e369ce544ef1edad0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accenti.sty \
tex-dblfont.sty \
tex-envmath.sty \
tex-evenpage.sty \
tex-graphfig.sty \
tex-mathcmd.sty \
tex-quotes.sty \
tex-sobolev.sty \
texlive-bosisio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphics.sty \
tex-subfigure.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
