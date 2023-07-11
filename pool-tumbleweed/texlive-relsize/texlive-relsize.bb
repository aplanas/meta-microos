SUMMARY = "Set the font size relative to the current font size"
DESCRIPTION = "The basic command of the package is \\relsize, whose argument is \
a number of \\magsteps to change size; from this are defined \
commands \\larger, \\smaller, \\textlarger, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.1svn30707"

RPM_NAME = "texlive-relsize-2023.201.4.1svn30707-53.2.noarch.rpm"
RPM_HASH = "d856c86028084c31dce8dacffe3ef644b4712d19789b40a6140577379a2d5da06cf3e0b6a9f0529cdf0e2bb768afeb8f34567d25cfdfc49f180c4d8dbdd86747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-relsize.sty \
texlive-relsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-type1cm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
