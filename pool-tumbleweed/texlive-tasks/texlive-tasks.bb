SUMMARY = "Horizontally columned lists"
DESCRIPTION = "The reason for the creation of the tasks environment was an \
unwritten agreement in German maths textbooks (especially \
(junior) high school textbooks) to organize exercises in \
columns counting horizontally rather than vertically. This is \
what the tasks package helps to achieve."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn61541"

RPM_NAME = "texlive-tasks-2023.201.1.4asvn61541-54.1.noarch.rpm"
RPM_HASH = "5f9eff48642190fc53674ce0f071aef62f3fbb98559344c8a5063d15c7aa472fdf2b4f7307b5f7f5ecc2946416e6f1a41940bc3fe5783a4a2190b243f07bd15e"
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
