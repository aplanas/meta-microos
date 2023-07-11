SUMMARY = "Marginal pictures"
DESCRIPTION = "Provides environments randbild to draw small marginal plots \
(using the packages pstricks and pst-plot), and randbildbasis \
(the same, only without the automatically drawn coordinate \
system)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-randbild-2023.201.0.0.2svn15878-53.2.noarch.rpm"
RPM_HASH = "d46d71108513d8004eff3cec0db728ea0c3e801e4428fee4f6db77c5cf83c36e1fafeff9eacc9f10db29b5bdf817c2c0a66edb1b9963bcb62d86b8c664507c11"
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
