SUMMARY = "Create images based on a L-system"
DESCRIPTION = "pst-lsystem is a PSTricks based package for creating images \
based on a L-system. A L-system (Lindenmayer system) is a set \
of rules which can be used to model the morphology of a variety \
of organisms or fractals like the Kochflake or Hilbert curve."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-2023.209.0.0.02svn49556-53.1.noarch.rpm"
RPM_HASH = "b66da363f0992e94dac776b60523812ec42e7ca93441171ce9b47cca704bcf868743cad97af518338269a107f98e3291600a318491842b3fbdf5e0e4e2763d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-lsystem.sty \
tex-pst-lsystem.tex \
texlive-pst-lsystem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
