SUMMARY = "Tool macros"
DESCRIPTION = "A package for (La)TeX which provides some macros which are \
convenient for writing indexes, glossaries, or other macros. It \
contains macros which support: implicit macros; fancy optional \
arguments; loops over tokenlists and itemlists; searching and \
splitting; controlled expansion; redefinition of macros; and \
concatenated macro names; macros for text replacement."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn32260"

RPM_NAME = "texlive-toolbox-2023.209.5.1svn32260-53.1.noarch.rpm"
RPM_HASH = "97e8cad2caf580d3b6ab0380613711bd9f2b85d99308100fd6640590f0c1cf17f46c8d2b11ce29b1e3706b3e17a166f74536dc6970019340beac3f05af635d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-toolbox.sty \
texlive-toolbox"

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
