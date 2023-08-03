SUMMARY = "Generate timetables"
DESCRIPTION = "A highly-configurable package, with nice output and simple \
input. The macros use a radix sort mechanism so that the order \
of input is not critical."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-timetable-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "4c94e28f69c6d9f46fe61f9987b8481fd8d2d83f0c34b932bad9f2598e716b888e5cf8f67c5ff22e6625c7fed4bc82093cc6a12c43209cc702d52de68f716ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timetable.tex \
texlive-timetable"

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
