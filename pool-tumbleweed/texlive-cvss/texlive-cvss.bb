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

PV = "2023.209.1.1.0svn65169"

RPM_NAME = "texlive-cvss-2023.209.1.1.0svn65169-55.1.noarch.rpm"
RPM_HASH = "46101d95920cc88069a6f432a166693fa8fb0babe4556adbdf589ba55e7cda754aa456520263c2a5f0aab39e409abf56f5976b4f092c130e23b25b0c38e184e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cvss.sty \
texlive-cvss"

RDEPENDS:${PN} += "/usr/bin/sh \
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
