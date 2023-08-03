SUMMARY = "Marginal pictures"
DESCRIPTION = "Provides environments randbild to draw small marginal plots \
(using the packages pstricks and pst-plot), and randbildbasis \
(the same, only without the automatically drawn coordinate \
system)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-randbild-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "6dbd87636647bd5ca1c5ea44380f24dbf9d883ae397ce8b05972f5289a67077ace334311491709ad30eafcf77665f77b88d082c2c2d9a3c124e6b331ab06ce17"
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
