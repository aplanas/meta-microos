SUMMARY = "Asymmetric over-/underbraces in maths"
DESCRIPTION = "The package provides a character key-driven interface to \
supplement new constructions of the traditional \\overbrace and \
\\underbrace pairs in an asymmetric or arbitrary way."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64967"

RPM_NAME = "texlive-abraces-2023.209.2.1svn64967-55.1.noarch.rpm"
RPM_HASH = "47b5cf6303c902c7b1520c6d1914342dad7ea2dcd3b9b8457c95ec45549f126809e419a0feff09590e3e1235277f60036003b189ec711203537fe420af2fc7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abraces.sty \
texlive-abraces"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
