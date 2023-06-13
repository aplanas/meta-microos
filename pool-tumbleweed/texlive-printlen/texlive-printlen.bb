SUMMARY = "Print lengths using specified units"
DESCRIPTION = "\\printlength{length} prints the value of a LaTeX length in the \
units specified by \\uselengthunit{unit} ('unit' may be any TeX \
length unit except for scaled point, viz., any of: pt, pc, in, \
mm, cm, bp, dd or cc). When the unit is pt, the printed length \
value will include any stretch or shrink; otherwise these are \
not printed. The 'unit' argument may also be PT, in which case \
length values will be printed in point units but without any \
stretch or shrink values."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn19847"

RPM_NAME = "texlive-printlen-2023.201.1.1asvn19847-52.1.noarch.rpm"
RPM_HASH = "6b2a4d3baf8d28ec50efc3eebf7318d5689658a6f25edf46f294d535d8811cc6117814d044453ebd465f3a62d505517c2badb7229a439cc8015ca82f362b9669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(printlen.sty) \
texlive-printlen"

RDEPENDS:${PN} += "/bin/sh \
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
