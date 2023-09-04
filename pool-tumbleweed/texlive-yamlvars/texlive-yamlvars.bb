SUMMARY = "A YAML parser and tool for easy LaTeX definition creation"
DESCRIPTION = "This LuaLaTeX package provides a YAML parser and some functions \
to declare and define LaTeX definitions using YAML files."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64949"

RPM_NAME = "texlive-yamlvars-2023.209.svn64949-53.2.noarch.rpm"
RPM_HASH = "4d4f4dd584c2799e7ebcc78968f530e039475db1977d394afe083ae88419f78aea77e41a0ad469bf3c3bfc01edaeb8bf2be15c6b44082823bfccc9bee6d22e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yamlvars.sty \
texlive-yamlvars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-luacode.sty \
tex-penlight.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
