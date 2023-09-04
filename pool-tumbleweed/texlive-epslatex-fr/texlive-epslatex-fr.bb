SUMMARY = "French version of 'graphics in LaTeX'"
DESCRIPTION = "This is the French translation of epslatex, and describes how \
to use imported graphics in LaTeX(2e) documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-epslatex-fr-2023.209.svn19440-54.2.noarch.rpm"
RPM_HASH = "8cac29ffe39c16c1b94819e632271a2a63e151615dabfcd4046ff729b2fc5b388298d32ad51b302013bab47783d0f4c7e68b4c57769bf480b22589e57e09f23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epslatex-fr"

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
