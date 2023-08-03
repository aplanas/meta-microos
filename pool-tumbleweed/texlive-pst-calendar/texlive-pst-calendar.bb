SUMMARY = "Plot calendars in 'fancy' ways"
DESCRIPTION = "The package uses pstricks and pst-3d to draw tabular calendars, \
or calendars on dodecahedra with a month to each face (the \
package also requires the multido and pst-xkey packages). The \
package works for years 2000-2099, and has options for \
calendars in French German and English, but the documentation \
is not available in English."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.48svn60480"

RPM_NAME = "texlive-pst-calendar-2023.209.0.0.48svn60480-53.1.noarch.rpm"
RPM_HASH = "b7e16a3ab1cc7483941f61aa15af2630cf45d85c8bf63b6d2dd144f92bd3086bec827c4a87df9f2971f613fdf8f71b742f8239422114e259696f02942d6bbaa9"
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
