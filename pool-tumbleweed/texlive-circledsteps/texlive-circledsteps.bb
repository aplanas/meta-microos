SUMMARY = "Typeset circled numbers"
DESCRIPTION = "This package generates circled numbers (or other kinds of \
markers or small text) to mark 'steps' in procedures, \
exercises, and so on."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn63255"

RPM_NAME = "texlive-circledsteps-2023.209.1.3.1svn63255-54.1.noarch.rpm"
RPM_HASH = "521602356846351cd6d28fd1826a005e0cb0b0fcb90ebb66d87c90e4fc13383ff6bb39f6733bbfa7757abdbf014c98e9a3f3808fc02d45712a1cd01e69260e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circledsteps.sty \
texlive-circledsteps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pict2e.sty \
tex-picture.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
