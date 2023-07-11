SUMMARY = "Print various kinds 2/5 and Code 39 bar codes"
DESCRIPTION = "The package contains macros for printing various 2/5 bar codes \
and Code 39 bar codes. The macros do not use fonts but create \
the bar codes directly using vertical rules. It is therefore \
possible to vary width to height ratio, ratio of thin and thick \
bars. The package is therefore convenient for printing ITF bar \
codes as well as bar codes for identification labels for HP \
storage media."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-makebarcode-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "1adf99dd09398ff92e7deb5cf2610e68dcd6a95754b19d9cae24fe02f191111bfc367264dc6246ac147b31c045511c0a86ce56e6f90dd5c6704dbc4cb2cae01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebarcode.sty \
texlive-makebarcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
