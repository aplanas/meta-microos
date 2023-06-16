SUMMARY = "Tabbing with accented letters"
DESCRIPTION = "By default, some of the tabbing environment's commands clash \
with default accent commands; LaTeX provides the odd commands \
\\a', etc., to deal with the clash. The package offers a variant \
of the tabbing environment which does not create this \
difficulty, so that users need not learn two sets of accent \
commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59715"

RPM_NAME = "texlive-tabbing-2023.201.svn59715-57.1.noarch.rpm"
RPM_HASH = "6c65cd104af039501069d1118e8a272ae9a42cb9afced295f3a951f543e9be52532825d5babb7fb98a9a8789ccb45636b934b330ea6d2d1add74bd70f96b716a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Tabbing.sty \
texlive-tabbing"

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
