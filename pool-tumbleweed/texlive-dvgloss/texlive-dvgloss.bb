SUMMARY = "Facilities for setting interlinear glossed text"
DESCRIPTION = "The package provides extensible macros for setting interlinear \
glossed text -- useful, for instance, for typing linguistics \
papers. The operative word here is 'extensible': few features \
are built in, but some flexible and powerful facilities are \
included for adding your own."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-2023.201.0.0.1svn29103-53.2.noarch.rpm"
RPM_HASH = "40bccb4fb341aef3a1a7406e34a3c567d69537322b1fec4b5964281ca9781bb65d490e5792365a41a93aa899efa851250b457d92ab5fb4bfa7f8855cdf0c52f5"
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
