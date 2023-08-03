SUMMARY = "Create beautiful semester timetables and more"
DESCRIPTION = "This package defines several useful environments for a \
beautiful printable semester plan. It includes a timetable \
(which is using the schedule-Package) as well as appointments, \
deadlines, and exams. The package requires color, TikZ, \
schedule, and fontawesome. Furthermore, documents need to be \
compiled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-2023.209.1.0svn56841-54.1.noarch.rpm"
RPM_HASH = "44bae91d281a86d084d37195bc469b6eca7715b3051c14471b0ec7cebe146a1f59a1acb8cd3e835f1bea16e2201f06e6e0d1289fbbe4583f66b91905ce0db79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semesterplanner.sty \
texlive-semesterplanner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fontawesome.sty \
tex-schedule.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
