SUMMARY = "A YAML parser and tool for easy LaTeX definition creation"
DESCRIPTION = "This LuaLaTeX package provides a YAML parser and some functions \
to declare and define LaTeX definitions using YAML files."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64949"

RPM_NAME = "texlive-yamlvars-2023.201.svn64949-52.2.noarch.rpm"
RPM_HASH = "7daa3cb32eaf948fe1e1dbef23e1da96635137d9f9bfc6fdde8115408a3aa6bfcb3420952397de4c57ab5c251c879b8bbf717039ce1fcc057399b2a34c81604c"
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
