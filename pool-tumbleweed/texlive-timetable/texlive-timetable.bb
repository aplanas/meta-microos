SUMMARY = "Generate timetables"
DESCRIPTION = "A highly-configurable package, with nice output and simple \
input. The macros use a radix sort mechanism so that the order \
of input is not critical."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-timetable-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "4d728ab72d2d7ca2cca875701aedb43ed0b13688a2bf02e0a941cb9a5ebe533fc983fe331be3216360e3ebb7aed25fcc1b8df9413a909ac45b72303de0a6cbfb"
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
