SUMMARY = "Input encoding with fallback procedures"
DESCRIPTION = "The rtkinenc package is functionally similar to the standard \
LaTeX package inputenc: both set up active characters so that \
an input character outside the range of 7-bit visible ASCII is \
coverted into one or more corresponding LaTeX commands. The \
main difference lies in that rtkinenc allows the user to \
specify a fallback procedure to use when the text command \
corresponding to some input character isn't available. Names of \
commands in rtkinenc have been selected so that it can read \
inputenc encoding definition files, and the aim is that \
rtkinenc should be backwards compatible with inputenc. rtkinenc \
is not a new version of inputenc though, nor is it part of \
standard LaTeX. For an example of how rtkinenc is used, the \
user may look at the tclldoc class."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20003"

RPM_NAME = "texlive-rtkinenc-2023.209.1.0svn20003-54.1.noarch.rpm"
RPM_HASH = "2868213f476aac5587dcb27e65d10b4fb969bd334d13b079ebee8cea998cfbce3beb27f7a0f2944fb98649b6ef497f842783d0d3463684e522e9a2310250792d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rtkinenc.sty \
texlive-rtkinenc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
