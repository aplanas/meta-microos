SUMMARY = "Model TeX format creation files"
DESCRIPTION = "This bundle provides a collection of model .ini files for \
creating TeX formats. These files are commonly used to \
introduced distribution-dependent variations in formats. They \
are also used to allow existing format source files to be used \
with newer engines, for example to adapt the plain e-TeX source \
file to work with XeTeX and LuaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn40533"

RPM_NAME = "texlive-tex-ini-files-2023.209.svn40533-55.1.noarch.rpm"
RPM_HASH = "1a454c4bcd53ee4a1ccd2cc2c3026c8b4f67747150a8c6638bb20233708fe3f0b43661d2eb56038393fca652749c92f98501a7af852e5fe88122f736e3f28f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-tex-ini-files \
tex-luatexconfig.tex \
tex-pdftexconfig.tex \
texlive-tex-ini-files"

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
