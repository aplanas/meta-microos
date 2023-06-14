SUMMARY = "Add colour to LaTeX tables"
DESCRIPTION = "The package allows rows and columns to be coloured, and even \
individual cells."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn64015"

RPM_NAME = "texlive-colortbl-2023.201.1.0fsvn64015-53.1.noarch.rpm"
RPM_HASH = "4ffad2066cbd2a3d78b009da9f52e1d6482dacfacc9af2b802b29dbbdd703c31f478bfe6c43c09190da02ef69f4b31bb77a2bb8a9a9ac3d752f1300899dec672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colortbl.sty \
texlive-colortbl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
