SUMMARY = "Provides a horizontal timeline"
DESCRIPTION = "A timeline package that allows labelling of events with per-day \
granularity. Other features include relative positioning with \
unit specification, adjustable tick mark step size, and scaling \
to specified width."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn37934"

RPM_NAME = "texlive-chronology-2023.201.1.1.1svn37934-53.1.noarch.rpm"
RPM_HASH = "cc54c18f84d45100b6338b84b67c0ee2f8e4c7413e7f16c48b104ed7c3f4628a5ab3f9d9bb9fbe1110dafdb960601b4dd58fe66da81e95912cd99a79dd82f873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chronology.sty) \
texlive-chronology"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
