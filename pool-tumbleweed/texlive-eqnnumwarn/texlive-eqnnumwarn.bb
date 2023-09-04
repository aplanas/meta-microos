SUMMARY = "Modifies the amsmath equation environments to warn for a displaced equation number"
DESCRIPTION = "Sometimes an equation is too long that an equation number will \
be typeset below the equation itself, but yet not long enough \
to yield an 'overfull \\hbox' warning. The eqnnumwarn package \
modifies the standard amsmath numbered equation environments to \
throw a warning whenever this occurs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-2023.209.1.0svn45511-54.2.noarch.rpm"
RPM_HASH = "4406cc688c7cd5e2735cabf7d85502fdf889e0245e3fdf709a7195b14588945241a1a73905c8285cc7c5f149fc760ded894775992cf20945ca6ba1a4d2b53730"
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
