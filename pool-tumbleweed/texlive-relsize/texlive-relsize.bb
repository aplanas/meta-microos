SUMMARY = "Set the font size relative to the current font size"
DESCRIPTION = "The basic command of the package is \\relsize, whose argument is \
a number of \\magsteps to change size; from this are defined \
commands \\larger, \\smaller, \\textlarger, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.1svn30707"

RPM_NAME = "texlive-relsize-2023.209.4.1svn30707-54.1.noarch.rpm"
RPM_HASH = "912548de645fabda465ecade660552314076deb804b850ee65e9d6e65b3e2fc472ab330d2cd7f66602d0f3b8b7d3e25ed73361e73254bae7cb84ad33f0dbfc8f"
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
