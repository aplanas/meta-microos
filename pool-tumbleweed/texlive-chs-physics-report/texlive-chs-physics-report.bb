SUMMARY = "Physics lab reports for Carmel High School"
DESCRIPTION = "This package may optionally be used by students at Carmel High \
School in Indiana in the United States to write physics lab \
reports for FW physics courses. As many students are beginners \
at LaTeX, it also attempts to simplify the report-writing \
process by offering macros for commonly used notation and by \
automatically formatting the documents for students who will \
only use TeX for mathematics and not typesetting. The package \
depends on amsmath, calc, fancyhdr, geometry, graphicx, \
letltxmacro, titlesec, transparent, and xcolor."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-chs-physics-report-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "0b87975b6bd14b2b1e946419b9654875df2065c7e02c896ede8d1336c90fe1362a740b6eba1889845e142ddffbbb3edc587626caa7413be5a88e26aec82cd13a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chs-physics-report.sty \
texlive-chs-physics-report"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-letltxmacro.sty \
tex-titlesec.sty \
tex-transparent.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
