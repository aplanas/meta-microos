SUMMARY = "TeX to PostScript generic macros and add-ons"
DESCRIPTION = "TeX to PostScript generic macros and add-ons: transformations \
of EPS files, prepress preparation, color separation, mirror, \
etc."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-tex-ps-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "4c10f584823c91d96a7c934b87d307c245cf29c12fa6978382c2fd2d9e79cec4c0720dd6e37bc8751c0ef3c80f02d13e8fc154a576ead50a67f7e0da6d42098c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmyk-hax.tex \
tex-epsfx.tex \
tex-poligraf.sty \
tex-trans.tex \
texlive-tex-ps"

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
