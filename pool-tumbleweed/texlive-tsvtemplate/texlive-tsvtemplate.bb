SUMMARY = "Apply a template to a tsv file"
DESCRIPTION = "This is a simple tsv (tab-separated values) reader for LuaLaTeX \
and plain LuaTeX. It also supports (non-quoted) comma-separated \
values, or indeed values separated by any character."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-2023.209.2022_1.0svn65333-53.1.noarch.rpm"
RPM_HASH = "e04d3eb0e858d2465af98b543867e5c46e2b106a550cf52d966e2f260a8baf1cb394909bcdb7ad2c6baa9c63cae3db5ef54aa526331047c7491fe31ef6a4188c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tsvtemplate.sty \
tex-tsvtemplate.tex \
texlive-tsvtemplate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
