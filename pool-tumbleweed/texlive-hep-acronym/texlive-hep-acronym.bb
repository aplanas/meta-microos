SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-acronym package provides an acronym macro based on the \
glossaries package. The package is loaded with \
\\usepackage{hep-acronym}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-2023.201.1.1svn64890-53.1.noarch.rpm"
RPM_HASH = "c8c3f7aeabf831eb9117a431b2a70cc6627773169cb2c7d15c3d6aef3c6bfdb207026e06e8406cd5955bc13d9976715211dbcf1f57c3dfabde4278792b6a2391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep-acronym.sty) \
texlive-hep-acronym"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amstext.sty) \
tex(everyhook.sty) \
tex(glossaries-extra.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
