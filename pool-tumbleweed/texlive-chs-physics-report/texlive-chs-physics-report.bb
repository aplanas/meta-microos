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

PV = "2023.209.svn54512"

RPM_NAME = "texlive-chs-physics-report-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "c4281797e523dfbfe7c8d96ba37e5811e4b6de3d80a29bad8d33626d4004c100987b01039a237d46f70de91bcab1fb7b8be620b42c146e28bec0086fdc59c811"
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
