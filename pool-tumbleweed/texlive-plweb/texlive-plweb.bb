SUMMARY = "Literate Programming for Prolog with LaTeX"
DESCRIPTION = "Instead of having to transform the common source into program \
or documentation, the central idea was to develop a method to \
have one common source which can be interpreted by a Prolog \
system as well as by LaTeX, whether that Prolog system be \
C-Prolog, Quintus-Prolog, or ECLiPSe."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-plweb-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "28929e24d54c6190d264c05779db461bd85ba08484553caf2ca874fe7aef67ce89a11c3b7164bf3241b5025d17646b303673b32ebee02ccd5e19249e77e67399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pcode.sty \
tex-pl.cfg \
tex-pl.sty \
texlive-plweb"

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
