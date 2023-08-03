SUMMARY = "Sample configuration files for LaTeX color and graphics"
DESCRIPTION = "This bundle includes color.cfg and graphics.cfg files that set \
default 'driver' options for the color and graphics packages. \
It contains support for defaulting the new LuaTeX option which \
was added to graphics and color in the 2016-02-01 release. The \
LuaTeX option is only used for LuaTeX versions from 0.87, older \
versions use the pdfTeX option as before."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41448"

RPM_NAME = "texlive-graphics-cfg-2023.209.svn41448-54.1.noarch.rpm"
RPM_HASH = "5e41ea65a59948188802caa1ed1f6db05bb1a88b68a9e344410bf8f1e89444861d115176305a7efcf2d9c2fa1d0387f1628419ca9bf4e57165ed756411b1be64"
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
