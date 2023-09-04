SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-bibliography package extends the BibLaTeX package with \
some functionality mostly useful for high energy physics. In \
particular it makes full use of all BibTeX fields provided by \
Discover High-Energy Physics. The package is loaded with \
\\usepackage{hep-bibliography}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-2023.209.1.1svn64888-54.2.noarch.rpm"
RPM_HASH = "5f335d06853c61b54fafd23a877c162bf45df1ac08f96f593e4251272f44980b720a6e05c8f7a6857d06c26cd7e9d78960d26849ff06239e7d9d16468e7b732d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-bibliography.sty \
texlive-hep-bibliography"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-kvoptions.sty \
tex-relsize.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
