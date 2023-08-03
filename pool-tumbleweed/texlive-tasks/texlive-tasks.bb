SUMMARY = "Horizontally columned lists"
DESCRIPTION = "The reason for the creation of the tasks environment was an \
unwritten agreement in German maths textbooks (especially \
(junior) high school textbooks) to organize exercises in \
columns counting horizontally rather than vertically. This is \
what the tasks package helps to achieve."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4asvn61541"

RPM_NAME = "texlive-tasks-2023.209.1.4asvn61541-55.1.noarch.rpm"
RPM_HASH = "a2a0fa206abd2e5a2e5bebd0f8ddb604571461e467295be9244912f2199c819fecb3e274afbef4759c245f92e732385c1efeed126594bb38779303ce9f963465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tasks.cfg \
tex-tasks.sty \
texlive-tasks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
