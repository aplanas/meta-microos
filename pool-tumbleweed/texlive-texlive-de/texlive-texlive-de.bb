SUMMARY = "TeX Live manual (German)"
DESCRIPTION = "The texlive-de package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66573"

RPM_NAME = "texlive-texlive-de-2023.209.svn66573-55.1.noarch.rpm"
RPM_HASH = "a20a587c131df0990245be4a06afe78ece3fddf1fba01449534b8700659296c9b24679f8b4d330f1d752045294e562058b46b8dd797887eadf6f2395f1af8fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-de"

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
