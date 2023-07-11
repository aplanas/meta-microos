SUMMARY = "A highly readable and good looking CV and letter class"
DESCRIPTION = "This class provides, what I have found, to be an extremely \
attractive and highly readable CV which will lead to your CV \
being read rather than disgarded."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn61719"

RPM_NAME = "texlive-readablecv-2023.201.3.0svn61719-53.2.noarch.rpm"
RPM_HASH = "6b27f749c30c8ece8126a2011004e07db1446d98c350ccc5cffb16c66106059787c0ff539eebf49bd7a824a84a79cbb1f0ae601a6209f08ad0d7128bbdce8907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ReadableCV.cls \
texlive-readablecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-marvosym.sty \
tex-memoir.cls \
tex-multicol.sty \
tex-roboto.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
