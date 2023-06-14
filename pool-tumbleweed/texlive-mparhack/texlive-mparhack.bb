SUMMARY = "Work around a LaTeX bug in marginpars"
DESCRIPTION = "Works around the LaTeX bug that marginpars will sometimes come \
out at the wrong margin."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn59066"

RPM_NAME = "texlive-mparhack-2023.201.1.5svn59066-54.1.noarch.rpm"
RPM_HASH = "0a3b9141d73df71eb8bd3d66177959c0ac10bba1e238c7a14b75e94ed0c61a282090d956dad1cf1ba3f6f1221581d7d6bdd5a25594e2f8bc6a8e559b412337a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mparhack.sty \
texlive-mparhack"

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
