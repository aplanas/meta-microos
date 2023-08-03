SUMMARY = "Work around a LaTeX bug in marginpars"
DESCRIPTION = "Works around the LaTeX bug that marginpars will sometimes come \
out at the wrong margin."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn59066"

RPM_NAME = "texlive-mparhack-2023.209.1.5svn59066-55.1.noarch.rpm"
RPM_HASH = "fee1a690b4295c488c1ff9faef41c74775fa91750dab7b5ee97595614d6721f7951fcfd592db11eeff40dc520c3740d24271ad3a7de1692480345175b68876c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mparhack.sty \
texlive-mparhack"

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
