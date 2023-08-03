SUMMARY = "Lenses with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstLens that will draw a lens. Command parameters provide a \
remarkable range of effects."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn15878"

RPM_NAME = "texlive-pst-lens-2023.209.1.02svn15878-53.1.noarch.rpm"
RPM_HASH = "8f5e41ce008985063a859d15159ecd821de8e6f58b570f2a95ab2c0115bb44eca2a341d7e95f28a1a55a9626a5c6ba09d26e90543285512e78df051336476414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-lens.sty \
tex-pst-lens.tex \
texlive-pst-lens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
