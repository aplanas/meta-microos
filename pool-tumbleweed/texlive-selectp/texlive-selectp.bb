SUMMARY = "Select pages to be output"
DESCRIPTION = "Defines a command \\outputonly, whose argument is a list of \
pages to be output. With the command present (before \
\\begin{document}), only those pages are output. This package \
was inspired by code published by Knuth in TUGboat 8(2) (July \
1987)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn20185"

RPM_NAME = "texlive-selectp-2023.201.1.0svn20185-53.1.noarch.rpm"
RPM_HASH = "741ab86bd89f78e6ab3ec4f2c9895cd8a2060b5a1d36375f0bcb092598663e391ed35930427b8d68f6445886f483fe67cf7793925ac502e1d80c39edac83bfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(selectp.sty) \
texlive-selectp"
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
