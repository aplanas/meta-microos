SUMMARY = "Weekly schedules"
DESCRIPTION = "Automatically format weekly schedules using LaTeX's picture \
environment. It requires the packages calc and color. Its main \
feature is the accuracy with which appointments are \
represented: boxes drawn to represent a particular appointment \
are accurate to the minute -- i.e., a 31-minute appointment \
will have a box 1/30th longer than a 30-minute appointment. A \
number of features are included to allow the user to customize \
the output."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn51805"

RPM_NAME = "texlive-schedule-2023.209.1.20svn51805-54.1.noarch.rpm"
RPM_HASH = "27a599a713716dec8d53c671f97b759798f6b93c092d84abad90bc3410bc839ee96e20532b598057b6a119926852366c292b837efdbb3d5d78099b2abe579ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schedule.sty \
texlive-schedule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
