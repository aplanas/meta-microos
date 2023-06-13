SUMMARY = "Model TeX format creation files"
DESCRIPTION = "This bundle provides a collection of model .ini files for \
creating TeX formats. These files are commonly used to \
introduced distribution-dependent variations in formats. They \
are also used to allow existing format source files to be used \
with newer engines, for example to adapt the plain e-TeX source \
file to work with XeTeX and LuaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn40533"

RPM_NAME = "texlive-tex-ini-files-2023.201.svn40533-54.1.noarch.rpm"
RPM_HASH = "84425e66cf3ceef79a9a8c7b4d96b23cd81ad589ec7553f7d02600d42a3b8c483a519cd374e9ff12e69f3f6f9d0b080ea056de11ebf93e28d1638335be4ecdfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-tex-ini-files) \
tex(luatexconfig.tex) \
tex(pdftexconfig.tex) \
texlive-tex-ini-files"

RDEPENDS:${PN} += "/bin/sh \
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
