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

PV = "2023.201.1.20svn51805"

RPM_NAME = "texlive-schedule-2023.201.1.20svn51805-53.1.noarch.rpm"
RPM_HASH = "96a27e0db7016089f37183ec6384d28bb80861ca1a124da3ed54563acbc594038177c85500f58a7d729537c5c122259f090e0b0854f35f452cf44287d996c1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schedule.sty \
texlive-schedule"

RDEPENDS:${PN} += "/bin/sh \
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
