SUMMARY = "Vancouver style for BibLaTeX"
DESCRIPTION = "This package provides the Vancouver reference style for \
BibLaTeX. It is based on the numeric style and requires biber."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn55339"

RPM_NAME = "texlive-biblatex-vancouver-2023.201.0.0.1svn55339-53.1.noarch.rpm"
RPM_HASH = "02f407882474b050facc9bd07017bb8217e14fc248ef8ad527b4bb8f6acb33b1b29881acfb08937a4ccb1c910d4aaf8ef263ec492ade081b99e4f29bade0d8f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vancouver.bbx \
tex-vancouver.cbx \
texlive-biblatex-vancouver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-numeric.bbx \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
