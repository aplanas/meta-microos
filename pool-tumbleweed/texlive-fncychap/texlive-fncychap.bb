SUMMARY = "Seven predefined chapter heading styles"
DESCRIPTION = "Each style can be modified using a set of simple commands. \
Optionally one can modify the formatting routines in order to \
create additional chapter headings. This package was previously \
known as FancyChapter."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn20710"

RPM_NAME = "texlive-fncychap-2023.201.1.34svn20710-52.1.noarch.rpm"
RPM_HASH = "a729a77d03be0cc707a267651f90cd965c408cc21c5431e0822180dc72b1747ea939b5285d98bb10b14cf12a55a6c1b3101386aa289b47e35c7c6f5b0aedf115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fncychap.sty \
texlive-fncychap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
