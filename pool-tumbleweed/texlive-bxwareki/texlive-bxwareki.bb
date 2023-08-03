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

PV = "2023.209.0.0.6svn51286"

RPM_NAME = "texlive-bxwareki-2023.209.0.0.6svn51286-53.1.noarch.rpm"
RPM_HASH = "324f5a2908d1e7800f1fdd74ae58c2706406caf47ca43727ec977433edd856eec3aeded7e24c5f3fd02ffc62cd4782b2e9d6a6fb835a89c3c3023a3aa314c4ac"
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
