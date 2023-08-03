SUMMARY = "Prettyprinting SuperCollider source code"
DESCRIPTION = "Built on top of the listings package, the package allows \
effortless prettyprinting of SuperCollider source code in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-2023.209.0.0.1svn35087-54.1.noarch.rpm"
RPM_HASH = "db83e36ea1ed33bb0e08c7c223b1d046b82adc8d17365e1de5883da84a37687f74cc5795712ff0ec0945898e4413f477e2085cedb64e0397ae336777f41d02fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sclang-prettifier.sty \
texlive-sclang-prettifier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
