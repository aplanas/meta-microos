SUMMARY = "Extend the functionality of the calc package"
DESCRIPTION = "This package bundle consists of the following packages: \
bxcalcize: To make calc expressions available in more places. \
bxcalcux: To add user-defined units to the calc syntax. In \
addition, this bundle provides the bxcalc package, which simply \
loads the above-mentioned packages internally."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56431"

RPM_NAME = "texlive-bxcalc-2023.209.1.1svn56431-53.1.noarch.rpm"
RPM_HASH = "ab9b866e3860c6408f6390b1b7789b25d431f9d9ac6ef8cc666b9f193cd2e2b89ab1061ce8d39f9536f8fd9ba26a78855c4ade1c964217e9b747f2e8254937fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxcalc.sty \
tex-bxcalcize.sty \
tex-bxcalcux.sty \
texlive-bxcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
