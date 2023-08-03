SUMMARY = "Simple commands for caps-to-small-caps text"
DESCRIPTION = "This package provides a simple command (\\textcsc and \\cscshape) \
for caps-to-small-caps text, to allow for small caps acronyms \
to be presented as uppercase in text (useful for things like \
copying and pasting from a PDF)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64935"

RPM_NAME = "texlive-textcsc-2023.209.1.0.1svn64935-55.1.noarch.rpm"
RPM_HASH = "1da108fea931a3897c44a453cfa5e5a8ff002755e3fabec6802988cad7e6740d5e4bb9ce0cd7eaaf40108e5dd8041307526db8cd04825c6b10692d14cc729a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textcsc.sty \
texlive-textcsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
