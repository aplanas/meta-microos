SUMMARY = "Supplement to the Unicode math symbols"
DESCRIPTION = "The package provides a Unicode font with over 4,000 symbols to \
supplement the Unicode math symbols. It is compatible with and \
complements the AMS STIX2 math fonts, but focuses on new \
symbols and symbol variants more suited to work in logic."
LICENSE = "OFL-1.1"

PV = "2023.209.1.13svn63688"

RPM_NAME = "texlive-logix-2023.209.1.13svn63688-55.1.noarch.rpm"
RPM_HASH = "ae44d8a62db6549ca458f841d862c4de47ad02de4eb76c64df3e9570b59f85013d63072715df602e0269c5c6e3d36621c1a2ae70a44b1dd662134a1cdfef4c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logix.sty \
texlive-logix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arydshln.sty \
tex-iftex.sty \
tex-mathtools.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-logix-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
