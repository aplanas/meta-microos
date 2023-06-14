SUMMARY = "Marking things to do in a LaTeX document"
DESCRIPTION = "The package lets the user mark things to do later, in a simple \
and visually appealing way. The package takes several options \
to enable customization/finetuning of the visual appearance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.6svn65699"

RPM_NAME = "texlive-todonotes-2023.201.1.1.6svn65699-52.1.noarch.rpm"
RPM_HASH = "da406db8c9221ea2e8115c318e99396f93468365bcd0e8e62aec695b60f4a66322548bebf68bc322912075d274cc4bbb9f2c4a49c3d94cdc3d073fd8d582a2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-todonotes.sty \
texlive-todonotes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
