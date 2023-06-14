SUMMARY = "Letter document class"
DESCRIPTION = "Designed for formatting formless letters in German; can also be \
used for English (by those who can read the documentation). \
There are LaTeX 2.09 documentstyle and LaTeX 2e class files for \
both an 'old' and a 'new' version of g-brief."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0.3svn50415"

RPM_NAME = "texlive-g-brief-2023.201.4.0.3svn50415-52.1.noarch.rpm"
RPM_HASH = "2859d2b99a5b8a9c5f81bff09d3d1d44aa466f0ff1b62331307382a4e273053527813b3237a658a19fd5ccd07218d0f520b05d010c721730c4e5899caeaebb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-g-brief.cls \
tex-g-brief.sty \
tex-g-brief2.cls \
tex-g-brief2.sty \
texlive-g-brief"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-eurosym.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-letter.cls \
tex-marvosym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
