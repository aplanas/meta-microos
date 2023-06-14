SUMMARY = "Apply a template to a tsv file"
DESCRIPTION = "This is a simple tsv (tab-separated values) reader for LuaLaTeX \
and plain LuaTeX. It also supports (non-quoted) comma-separated \
values, or indeed values separated by any character."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn65333"

RPM_NAME = "texlive-tsvtemplate-2023.201.2022_1.0svn65333-52.1.noarch.rpm"
RPM_HASH = "6d427a8377325ee50c20c3bc2680ea7ac5e33fdb197c844947fdf38fc6a5ba582bf2c935b8c4ea9b779ef671068e8a9a7ce779352273384dbde87dfde69c8979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tsvtemplate.sty \
tex-tsvtemplate.tex \
texlive-tsvtemplate"

RDEPENDS:${PN} += "/bin/sh \
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
