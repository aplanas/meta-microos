SUMMARY = "Programmable table interface for LuaLaTeX"
DESCRIPTION = "This package allows you to modify a cell based on the contents \
of other cells using LaTeX macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-2023.201.1.0svn56113-52.1.noarch.rpm"
RPM_HASH = "478902f2efc97e99809dc136ae68e006d5ca8df469ce4f7ced738c42254f0400752572b81f7bf32202a85715785cb714fa9757a492c47d06e323301df3186871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaprogtable.sty \
texlive-luaprogtable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-luatexbase.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
