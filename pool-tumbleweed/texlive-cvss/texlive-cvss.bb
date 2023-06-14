SUMMARY = "Compute and display CVSS base scores"
DESCRIPTION = "The Common Vulnerability Scoring System (CVSS) is an open \
framework for communicating the characteristics and severity of \
software vulnerabilities. CVSS consists of three metric groups: \
Base, Temporal, and Environmental. This package allows the user \
to compute CVSS3.1 base scores and use them in documents, i.e. \
it only deals with the Base score. Temporal and Environental \
scores will be part of a future release. More information can \
be found at https://www.first.org/cvss/specification-document."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1.0svn65169"

RPM_NAME = "texlive-cvss-2023.204.1.1.0svn65169-54.1.noarch.rpm"
RPM_HASH = "40fdf813040527e0da3c72fed10dca7c510c3947bcc419bd6f710086152abdbec17ccdd0975610cca235d08826b8c4c4164cae38e9ba3588c42070c3d1228855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cvss.sty \
texlive-cvss"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-hyperref.sty \
tex-tcolorbox.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
