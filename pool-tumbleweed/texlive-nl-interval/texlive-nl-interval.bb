SUMMARY = "Represent intervals on the number line"
DESCRIPTION = "This package provides macros to simplify the process of \
representing intervals on the number line. It depends on \
tkz-fct, ifthen, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn58328"

RPM_NAME = "texlive-nl-interval-2023.209.1.0svn58328-55.1.noarch.rpm"
RPM_HASH = "8d2a093ec02c13a3317244efef73de60c737da7e20fc8bc1ed8b23f72fccf6636115de9d0c34ff9d43ef2266bdae13c0c67ff0ba0457e2a7ed6c5d4ebd771570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nl-interval.sty \
texlive-nl-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tkz-fct.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
