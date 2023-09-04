SUMMARY = "Sample configuration files for LaTeX color and graphics"
DESCRIPTION = "This bundle includes color.cfg and graphics.cfg files that set \
default 'driver' options for the color and graphics packages. \
It contains support for defaulting the new LuaTeX option which \
was added to graphics and color in the 2016-02-01 release. The \
LuaTeX option is only used for LuaTeX versions from 0.87, older \
versions use the pdfTeX option as before."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41448"

RPM_NAME = "texlive-graphics-cfg-2023.209.svn41448-54.2.noarch.rpm"
RPM_HASH = "89ed1574a8ace5dd2586aa4b1845e76d85705c3b29744797333327c2a2720d2fdce919f5f0f259da5ee797f8656dfcd38661dbe6523e7dabaa91689fbd67d6a4"
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
