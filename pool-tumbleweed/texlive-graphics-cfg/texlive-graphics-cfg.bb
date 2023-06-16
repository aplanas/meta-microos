SUMMARY = "Sample configuration files for LaTeX color and graphics"
DESCRIPTION = "This bundle includes color.cfg and graphics.cfg files that set \
default 'driver' options for the color and graphics packages. \
It contains support for defaulting the new LuaTeX option which \
was added to graphics and color in the 2016-02-01 release. The \
LuaTeX option is only used for LuaTeX versions from 0.87, older \
versions use the pdfTeX option as before."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41448"

RPM_NAME = "texlive-graphics-cfg-2023.201.svn41448-53.1.noarch.rpm"
RPM_HASH = "73409d197aba790ae56bedb5b246fb0da6e1808150a393c4d502593b06ac81346eb03f881ece52a1c39de174a70f73a0ffea46dfdae39aa5d5a0a0a60170ee9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color.cfg \
tex-graphics.cfg \
texlive-graphics-cfg"

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
