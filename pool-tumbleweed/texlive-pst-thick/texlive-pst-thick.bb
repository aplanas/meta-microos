SUMMARY = "Drawing very thick lines and curves"
DESCRIPTION = "The package supports drawing of very thick lines and curves in \
PSTricks, with various fillings for the body of the lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16369"

RPM_NAME = "texlive-pst-thick-2023.209.1.0svn16369-54.2.noarch.rpm"
RPM_HASH = "46a14a5bb5feb3d33da7877a23f2b70570a1ca5499a17be04720c4f93f3992622fbdef86c7731a5b1aed3a9d26824b22935537c908ed5eb3ac6ca2f7a8ba4d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-thick.sty \
tex-pst-thick.tex \
texlive-pst-thick"

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
