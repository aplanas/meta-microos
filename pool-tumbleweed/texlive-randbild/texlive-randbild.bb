SUMMARY = "Marginal pictures"
DESCRIPTION = "Provides environments randbild to draw small marginal plots \
(using the packages pstricks and pst-plot), and randbildbasis \
(the same, only without the automatically drawn coordinate \
system)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-randbild-2023.209.0.0.2svn15878-54.2.noarch.rpm"
RPM_HASH = "7a5119f947d51063dfc2329a2ba86b7b68e6cf48d25191e014c59f1c842bca950778622f332d58bccd079bbf84eaa700cd550cc6208fa053157c4788a8a418ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randbild.sty \
texlive-randbild"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-plot.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
