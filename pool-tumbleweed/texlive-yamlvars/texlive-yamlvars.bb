SUMMARY = "A YAML parser and tool for easy LaTeX definition creation"
DESCRIPTION = "This LuaLaTeX package provides a YAML parser and some functions \
to declare and define LaTeX definitions using YAML files."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64949"

RPM_NAME = "texlive-yamlvars-2023.209.svn64949-53.1.noarch.rpm"
RPM_HASH = "a6c60383e9db2dabf2b16d497e229a9ac44d481c8195ca888c601e516b44e6579f308d453e59b42ea4f08fe64263d0e0a07aa232b69a4c99533f842ca3757258"
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
