SUMMARY = "French version of 'graphics in LaTeX'"
DESCRIPTION = "This is the French translation of epslatex, and describes how \
to use imported graphics in LaTeX(2e) documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-epslatex-fr-2023.201.svn19440-53.1.noarch.rpm"
RPM_HASH = "3c97b24c6ef41cdba88c2a0daf5cf935bd4bce1ce651e0035282514229260d15fab1676cf8b7601d1de243c5bfea77971c1ba6d0b80f63f03ca68b73118ed976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epslatex-fr"

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
