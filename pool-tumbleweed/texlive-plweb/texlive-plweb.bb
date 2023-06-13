SUMMARY = "Literate Programming for Prolog with LaTeX"
DESCRIPTION = "Instead of having to transform the common source into program \
or documentation, the central idea was to develop a method to \
have one common source which can be interpreted by a Prolog \
system as well as by LaTeX, whether that Prolog system be \
C-Prolog, Quintus-Prolog, or ECLiPSe."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-plweb-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "2bcadc7646c161a6b4e200daa0805783d86103bcd8bea9fe3ab687062a2d5d0f5b9271f64bc47a66177f5380cf3a28c8530f290543fb4c03ff54d6c66b7257d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pcode.sty) \
tex(pl.cfg) \
tex(pl.sty) \
texlive-plweb"

RDEPENDS:${PN} += "/bin/sh \
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
