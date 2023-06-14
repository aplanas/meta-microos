SUMMARY = "Typeset documents with ICMC/USP watermarks"
DESCRIPTION = "With this package you can typeset documents with ICMC/USP Sao \
Carlos watermarks. ICMC is acronym for 'Instituto de Ciencias \
Matematicas e de Computacao' of the 'Universidade de Sao Paulo' \
(USP), in the city of Sao Carlos-SP, Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-2023.201.2.0svn49740-52.1.noarch.rpm"
RPM_HASH = "2b145bda7468cd9dcaafbd82da7b69ebf1ac171f4a6125d5c4d74db987c888f9d6c1e5b354109e7023602befeb05f3e7362fc8cf55ff3091fe09472cd34e752d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timbreicmc.sty \
texlive-timbreicmc"

RDEPENDS:${PN} += "/bin/sh \
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
