SUMMARY = "Set up Japanese font families for XeLaTeX"
DESCRIPTION = "The zxjafont package"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62864"

RPM_NAME = "texlive-zxjafont-2023.201.1.3svn62864-52.1.noarch.rpm"
RPM_HASH = "3b8387c6daeccc281f83882bdd834695740bffe76903da5f739288258c6a110b2c233fa7aa20b8fa29d68c8efcc98032ebd5737660221f76f67fce34ea35cc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafont.sty \
texlive-zxjafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
