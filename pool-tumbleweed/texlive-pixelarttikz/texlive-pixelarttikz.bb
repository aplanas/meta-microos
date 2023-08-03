SUMMARY = "Work with PixelArts, with TikZ"
DESCRIPTION = "The package defines commands and an environment for displaying \
pixel arts."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn65649"

RPM_NAME = "texlive-pixelarttikz-2023.209.0.0.1.0svn65649-52.1.noarch.rpm"
RPM_HASH = "55a86412c6cac30c9eb8e72704fbd36aa55e96e134815c34803bcae9efb6e4b37ab6442be64e57b34752ecf3c2932b91b55c36cf1631702d5fc7464b5c95b65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PixelArtTikz.sty \
texlive-pixelarttikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csvsimple.sty \
tex-expl3.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
