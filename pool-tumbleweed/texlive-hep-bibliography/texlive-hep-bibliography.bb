SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-bibliography package extends the BibLaTeX package with \
some functionality mostly useful for high energy physics. In \
particular it makes full use of all BibTeX fields provided by \
Discover High-Energy Physics. The package is loaded with \
\\usepackage{hep-bibliography}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-2023.209.1.1svn64888-54.1.noarch.rpm"
RPM_HASH = "aea2b90aae0eb3d6dbd8364f35a7e2cd05873ba847e3dbbe90c85cadcc852951d219055d8735df4c262ca634647151cb1a0746856e38ee6905f6b36a0a68e73f"
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
