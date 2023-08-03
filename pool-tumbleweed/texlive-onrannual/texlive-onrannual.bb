SUMMARY = "Class for Office of Naval Research Ocean Battlespace Sensing annual report"
DESCRIPTION = "This is an unofficial document class for writing ONR annual \
reports using LaTeX; as ONR has had numerous problems with \
LaTeX-generated PDF submissions in the past. A skeleton \
document (and its PDF output) are included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn17474"

RPM_NAME = "texlive-onrannual-2023.209.1.1svn17474-55.1.noarch.rpm"
RPM_HASH = "866eea5fb16d0d976be74bfdf040670f5964f17a75b1d8a8510ca9f3cea9a8b6bb6c716702cebde4d2c9adbf5951e6eaf842ffc3745a5591db14314087d6d176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onrannual.cls \
texlive-onrannual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-authblk.sty \
tex-caption.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-mathptmx.sty \
tex-parskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
