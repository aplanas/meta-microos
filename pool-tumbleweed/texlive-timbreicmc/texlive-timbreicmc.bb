SUMMARY = "Typeset documents with ICMC/USP watermarks"
DESCRIPTION = "With this package you can typeset documents with ICMC/USP Sao \
Carlos watermarks. ICMC is acronym for 'Instituto de Ciencias \
Matematicas e de Computacao' of the 'Universidade de Sao Paulo' \
(USP), in the city of Sao Carlos-SP, Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-2023.209.2.0svn49740-53.1.noarch.rpm"
RPM_HASH = "9e19575cc45978695b1e16fc30bf24bc9951e290727c5cc1dee0bcf166a4a875ee869b669e954a3371a7032ad29b4d481e4d2a67ef508fc1f2b85414e6b95270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timbreicmc.sty \
texlive-timbreicmc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
