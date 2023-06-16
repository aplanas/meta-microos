SUMMARY = "Convert dates from Gregorian to Japanese calender"
DESCRIPTION = "This LaTeX package provides commands to convert from the \
Gregorian calendar (e. g. 2018/8/28) to the Japanese rendering \
of the Japanese calendar (e. g. Heisei 30 nen 8 gatsu 28 nichi; \
actually with kanji characters). You can choose whether the \
numbers are written in Western numerals or kanji numerals. Note \
that the package only deals with dates in the year 1873 or \
later, where the Japanese calendar is really a Gregorian \
calendar with a different notation of years."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn51286"

RPM_NAME = "texlive-bxwareki-2023.201.0.0.6svn51286-52.1.noarch.rpm"
RPM_HASH = "d10561fe50ede2bed580868bc427e009f90beed54eeadced3b1e5a46891c5d31e4d332def924ac41a194d6d581e21fb19fff3928079c8bfe8ec8c6a67782ccd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxwareki-cd.def \
tex-bxwareki.sty \
tex-bxwareki2019.def \
texlive-bxwareki"

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
