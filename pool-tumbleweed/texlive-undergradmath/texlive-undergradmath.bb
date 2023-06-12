SUMMARY = "LaTeX Math for Undergraduates cheat sheet"
DESCRIPTION = "This is a cheat sheet for writing mathematics with LaTeX. It is \
aimed at US undergraduates."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57286"

RPM_NAME = "texlive-undergradmath-2023.201.svn57286-53.1.noarch.rpm"
RPM_HASH = "4dae6a6e760c4b8c1d46edf69a5dd18564f949e50591c23ded99d12dad74f59ccc19a29d14adb4ca4dfc6d310eeab66a2077c4f7a7ff16f839d1ca71ef8413bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undergradmath"
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
