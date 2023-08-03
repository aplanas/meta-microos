SUMMARY = "Giving meaning to various Unicode space characters"
DESCRIPTION = "LaTeX package that gives meaning to various Unicode space \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.05svn63123"

RPM_NAME = "texlive-uspace-2023.209.0.0.05svn63123-54.1.noarch.rpm"
RPM_HASH = "61c46520349c08b537fa88f1f4ef5c8d351e51a4123cf5e4cb154023349074fd38d5062089733e63f9a4a7e68c1e023bb3ca48a0220ca269c1f36ab10c5bf568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uspace.sty \
texlive-uspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-newunicodechar.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
