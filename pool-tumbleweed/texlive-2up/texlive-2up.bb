SUMMARY = "Macros to print two-up"
DESCRIPTION = "The 2up package offers considerable flexibility as to paper \
size and layout, and produces a standard dvi file without \
involving additional dvi or PostScript filters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn55076"

RPM_NAME = "texlive-2up-2023.201.1.3asvn55076-54.1.noarch.rpm"
RPM_HASH = "4ea565f424a5ee054e574a5f608e5fb8abdbe1664b03faddef896f8b96048bf54fadf9ba2570cead30ca1f57237a7ee1cc795eeeed38455e0eb39609f972ef12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2up.sty \
tex-2up.tex \
texlive-2up"

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
