SUMMARY = "Introduction to LaTeX, in Chinese"
DESCRIPTION = "A Chinese edition of the not so short introduction to LaTeX2e, \
with additional information of typesetting Chinese language."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.6.03svn61100"

RPM_NAME = "texlive-lshort-chinese-2023.201.6.03svn61100-54.1.noarch.rpm"
RPM_HASH = "d35d11283b12aa87e9ff682d9ecca95e0edffc427a05b2434dedb40437d52d495373e5c89ddeac351ae87cfecac85273f057dbbea07fdb02afafd8e1e72f5816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-chinese"

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
