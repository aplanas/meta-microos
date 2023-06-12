SUMMARY = "Set the font size relative to the current font size"
DESCRIPTION = "The basic command of the package is \\relsize, whose argument is \
a number of \\magsteps to change size; from this are defined \
commands \\larger, \\smaller, \\textlarger, etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.1svn30707"

RPM_NAME = "texlive-relsize-2023.201.4.1svn30707-53.1.noarch.rpm"
RPM_HASH = "9df9436b813465f012399543409aae7d516bafcc3246c503f9f0ed7d78892e18a1bd2c4771e85e62a9461b00fa17ab2f0a698b60fb0b7323d2f18a1b6b417895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(relsize.sty) \
texlive-relsize"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(type1cm.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
