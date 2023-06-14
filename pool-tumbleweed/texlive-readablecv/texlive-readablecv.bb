SUMMARY = "A highly readable and good looking CV and letter class"
DESCRIPTION = "This class provides, what I have found, to be an extremely \
attractive and highly readable CV which will lead to your CV \
being read rather than disgarded."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn61719"

RPM_NAME = "texlive-readablecv-2023.201.3.0svn61719-53.1.noarch.rpm"
RPM_HASH = "33552b07ae2d98bffbb3b552e751d1521a7ff7622cbe9fe9df3d0531f90f4061ae3aa3aba08b2b27d9beb986722da2b7202a5fd98adecdbd03ae302d3ac64f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ReadableCV.cls \
texlive-readablecv"

RDEPENDS:${PN} += "/bin/sh \
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
