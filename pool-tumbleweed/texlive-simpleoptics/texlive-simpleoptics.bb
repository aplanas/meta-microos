SUMMARY = "Drawing lenses and mirrors for optical diagrams"
DESCRIPTION = "This package provides some of macros for drawing simple lenses \
and mirrors for use in optical diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-2023.209.1.1.1svn62977-54.1.noarch.rpm"
RPM_HASH = "422acd39f583f9a5d38eed944c59e0cba921c07f4abda50b04837e597b0b464d791d90760244a9fea728edbf5996f90b08edd242ef5e00cce58ea1a921155932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleoptics.sty \
texlive-simpleoptics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
