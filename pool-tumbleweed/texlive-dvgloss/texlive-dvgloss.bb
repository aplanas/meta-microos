SUMMARY = "Facilities for setting interlinear glossed text"
DESCRIPTION = "The package provides extensible macros for setting interlinear \
glossed text -- useful, for instance, for typing linguistics \
papers. The operative word here is 'extensible': few features \
are built in, but some flexible and powerful facilities are \
included for adding your own."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-2023.201.0.0.1svn29103-53.1.noarch.rpm"
RPM_HASH = "cc292e51d3f386794a62987c3970c347e24a81d5b358dba6feb08bbe4e2a8df13b3fa5b302afcdf65fe9b5ada618fadb9fd5b0ca65b28f9df0aeede8bb77ca88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvgloss.sty \
texlive-dvgloss"

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
