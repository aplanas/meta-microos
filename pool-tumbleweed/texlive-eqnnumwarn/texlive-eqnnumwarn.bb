SUMMARY = "Modifies the amsmath equation environments to warn for a displaced equation number"
DESCRIPTION = "Sometimes an equation is too long that an equation number will \
be typeset below the equation itself, but yet not long enough \
to yield an 'overfull \\hbox' warning. The eqnnumwarn package \
modifies the standard amsmath numbered equation environments to \
throw a warning whenever this occurs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-2023.201.1.0svn45511-53.2.noarch.rpm"
RPM_HASH = "0eff21a21a21525e53811a2e96d27078047f72556823665323893382104428a95637ea05d68918199eabab4afe08e7c27c815b1f300b966ee07794f1333d181b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnnumwarn.sty \
texlive-eqnnumwarn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
