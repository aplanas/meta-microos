SUMMARY = "Wrapper to use the correct libertinus package according to the used TeX engine"
DESCRIPTION = "This package is only a wrapper for the two packages \
libertinus-type1 (pdfLaTeX) and libertinus-otf \
(LuaLaTeX/XeLaTeX). The Libertinus fonts are similiar to \
Libertine and Biolinum, but come with math symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn61719"

RPM_NAME = "texlive-libertinus-2023.201.0.0.02svn61719-54.1.noarch.rpm"
RPM_HASH = "f9dfe75326f6d9860b63d5c913a031cce72f0a87c9a8cc4bf2101007a9f130bc1424e115e14eaf56f67ba4b2df13bafdf873ba9676eb634d4acd89f19c222839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(libertinus.sty) \
texlive-libertinus"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
