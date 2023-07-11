SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-bibliography package extends the BibLaTeX package with \
some functionality mostly useful for high energy physics. In \
particular it makes full use of all BibTeX fields provided by \
Discover High-Energy Physics. The package is loaded with \
\\usepackage{hep-bibliography}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-2023.201.1.1svn64888-53.2.noarch.rpm"
RPM_HASH = "7bc1b896494a0be50e8f48b29e2faccf51eec1743611ededaaa486bd084b4c1f367243a88c26f5cbf580fe2e45a50646f652909fd75db4bd381659a12373512f"
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
