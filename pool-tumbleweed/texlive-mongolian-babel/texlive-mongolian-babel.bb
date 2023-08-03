SUMMARY = "A language definition file for Mongolian in Babel"
DESCRIPTION = "This package provides support for Mongolian in a Cyrillic \
alphabet. (The work derives from the earlier Russian work for \
babel.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-2023.209.1.2svn15878-55.1.noarch.rpm"
RPM_HASH = "04d5478c55661c97812ab16589249416abb9aeeb322bf0242f7cf618b224829ec8d623c9ae69917c88cf1a20a817a5e7a05e1fde7215bb8bfa6dcb2647105d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mn.def \
tex-mongolian.ldf \
tex-mongolian.sty \
texlive-mongolian-babel"

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
