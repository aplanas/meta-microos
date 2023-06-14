SUMMARY = "Supplement to the Unicode math symbols"
DESCRIPTION = "The package provides a Unicode font with over 4,000 symbols to \
supplement the Unicode math symbols. It is compatible with and \
complements the AMS STIX2 math fonts, but focuses on new \
symbols and symbol variants more suited to work in logic."
LICENSE = "OFL-1.1"

PV = "2023.201.1.13svn63688"

RPM_NAME = "texlive-logix-2023.201.1.13svn63688-54.1.noarch.rpm"
RPM_HASH = "6efcc6bc7c06b29cad509547f052cd08b8e265da17d737e379e5fb38b7570da3d96a4a24459acd4e0b1212fe1a7052876924dce9e8fe6d3a658860563f9f6e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logix.sty \
texlive-logix"

RDEPENDS:${PN} += "/bin/sh \
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
