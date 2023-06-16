SUMMARY = "Extend the functionality of the calc package"
DESCRIPTION = "This package bundle consists of the following packages: \
bxcalcize: To make calc expressions available in more places. \
bxcalcux: To add user-defined units to the calc syntax. In \
addition, this bundle provides the bxcalc package, which simply \
loads the above-mentioned packages internally."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56431"

RPM_NAME = "texlive-bxcalc-2023.201.1.1svn56431-52.1.noarch.rpm"
RPM_HASH = "cb21add7f2e7576d4623cde8bdb1eb8175f28c3f74a537784879355fc411708d6e2caffad34da6a1ce754999f804d168b439754d6ad27e05edef355103b983ee"
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
