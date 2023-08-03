SUMMARY = "Commands for typesetting total values of counters"
DESCRIPTION = "This LaTeX package offers commands for typesetting total values \
of counters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn56214"

RPM_NAME = "texlive-totalcount-2023.209.1.0asvn56214-53.1.noarch.rpm"
RPM_HASH = "4405f48127069437355206472b93462d1bfb5ce97c56be81ff06088b52dfc9e8db5d84205ea9d15434aa1711d0546469cf4a3b5b82ffe0beba91203626a549a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totalcount.sty \
texlive-totalcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
