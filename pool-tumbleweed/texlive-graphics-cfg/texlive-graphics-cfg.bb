SUMMARY = "Sample configuration files for LaTeX color and graphics"
DESCRIPTION = "This bundle includes color.cfg and graphics.cfg files that set \
default 'driver' options for the color and graphics packages. \
It contains support for defaulting the new LuaTeX option which \
was added to graphics and color in the 2016-02-01 release. The \
LuaTeX option is only used for LuaTeX versions from 0.87, older \
versions use the pdfTeX option as before."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41448"

RPM_NAME = "texlive-graphics-cfg-2023.201.svn41448-53.2.noarch.rpm"
RPM_HASH = "ef13c59e9a05f3f8fa7b300b42eed063549298f46d3e01d3937040bdc57358b0b17c7f2474bc929c95db9dc67c6a40af31b9d4255ee7eae765412765dca785ab"
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
