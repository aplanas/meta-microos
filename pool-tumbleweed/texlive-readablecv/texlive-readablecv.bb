SUMMARY = "A highly readable and good looking CV and letter class"
DESCRIPTION = "This class provides, what I have found, to be an extremely \
attractive and highly readable CV which will lead to your CV \
being read rather than disgarded."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn61719"

RPM_NAME = "texlive-readablecv-2023.209.3.0svn61719-54.1.noarch.rpm"
RPM_HASH = "f9e19ba5da56e37e011fcd0a5b4834a9f9ae11dacea92b63d0c31a93ca1a13fd34a22feb9304182d1f0e3dffa13341f5839e679096b9e5fce24c245d7edfae63"
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
