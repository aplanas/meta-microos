SUMMARY = "Work with PixelArts, with TikZ"
DESCRIPTION = "The package defines commands and an environment for displaying \
pixel arts."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn65649"

RPM_NAME = "texlive-pixelarttikz-2023.201.0.0.1.0svn65649-51.1.noarch.rpm"
RPM_HASH = "06bc86089c77346248371ac481810a83a7b590703f8cd3e7a8bc80b29ea20b63e1254e3dc5ee7e8cef85bbcbdf6531392aac97b0328e670015f569c64de65e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PixelArtTikz.sty \
texlive-pixelarttikz"

RDEPENDS:${PN} += "/bin/sh \
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
