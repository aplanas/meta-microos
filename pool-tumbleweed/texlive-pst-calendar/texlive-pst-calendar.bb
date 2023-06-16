SUMMARY = "Plot calendars in 'fancy' ways"
DESCRIPTION = "The package uses pstricks and pst-3d to draw tabular calendars, \
or calendars on dodecahedra with a month to each face (the \
package also requires the multido and pst-xkey packages). The \
package works for years 2000-2099, and has options for \
calendars in French German and English, but the documentation \
is not available in English."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-2023.201.0.0.48svn60480-52.1.noarch.rpm"
RPM_HASH = "6d0bd1a5c5a0ff9d943dda9ef0fed5ac86b45fc40d5d0a6f356d889fe06503b6abd35888fffdbbe2d8bd5cabee4d4115abf675cbde8e779ce5e508abd2221cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-calendar.sty \
texlive-pst-calendar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
