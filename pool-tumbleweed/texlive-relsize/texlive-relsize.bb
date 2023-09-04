SUMMARY = "Set the font size relative to the current font size"
DESCRIPTION = "The basic command of the package is \\relsize, whose argument is \
a number of \\magsteps to change size; from this are defined \
commands \\larger, \\smaller, \\textlarger, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.1svn30707"

RPM_NAME = "texlive-relsize-2023.209.4.1svn30707-54.2.noarch.rpm"
RPM_HASH = "a65486c1ffd2920af1193b846ea778ff5a3ca5ce53fb95ba1aa5374437e9cad1fa1ea5d501aa8fd4433ae45fa8929a9da594bedbdf3640c524e886a066aa6646"
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
