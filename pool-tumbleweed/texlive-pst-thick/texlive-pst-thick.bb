SUMMARY = "Drawing very thick lines and curves"
DESCRIPTION = "The package supports drawing of very thick lines and curves in \
PSTricks, with various fillings for the body of the lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16369"

RPM_NAME = "texlive-pst-thick-2023.201.1.0svn16369-53.2.noarch.rpm"
RPM_HASH = "7a397355f616dc7bb8e7e5f78252033bae0c1c8e7431bdec37e608618ce4f35b859509ccbab2cdfc780be4826c1b27150e6e09518bde6cb47b958bf923e28540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-thick.sty \
tex-pst-thick.tex \
texlive-pst-thick"

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
