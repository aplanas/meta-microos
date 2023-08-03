SUMMARY = "Label any kind of term with a continuous counter"
DESCRIPTION = "The termlist package provides environments to indent and label \
any kind of terms with a continuous number. Candidate terms may \
appear inside an equation or eqnarray environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn18923"

RPM_NAME = "texlive-termlist-2023.209.1.1svn18923-55.1.noarch.rpm"
RPM_HASH = "ff296d2d04e173516e4a92654bdc49a648ab53421099310791cbd59c9e06baf65c0e0f4362c56df9bcb062cb8befff5e75ad69a2f13e6fb1ecf02b12835f381a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termlist.sty \
texlive-termlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
