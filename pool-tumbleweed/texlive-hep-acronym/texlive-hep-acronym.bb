SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-acronym package provides an acronym macro based on the \
glossaries package. The package is loaded with \
\\usepackage{hep-acronym}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-2023.201.1.1svn64890-53.2.noarch.rpm"
RPM_HASH = "dca16609956d105013947101d9623a54402921bc9fd834d77f7a1776011883d474c7b6a8953f3b1250f68901491ff4b1591d6b607876482fbc81bb512382ebde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-acronym.sty \
texlive-hep-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-everyhook.sty \
tex-glossaries-extra.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
