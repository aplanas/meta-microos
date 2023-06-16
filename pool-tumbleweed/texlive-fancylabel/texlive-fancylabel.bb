SUMMARY = "Complex labelling with LaTeX"
DESCRIPTION = "The package provides a complex labelling scheme. It is designed \
to support the needs of the author's chemschemex package"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46736"

RPM_NAME = "texlive-fancylabel-2023.201.1.1svn46736-52.1.noarch.rpm"
RPM_HASH = "7a384697b0760cf434a1f94052cc107158f06302b940692b5ab43b17909e79e52345763f4e916af6ce08e392febbe27bc85ff2eba902b561861516b54bd49407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancylabel.sty \
texlive-fancylabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
