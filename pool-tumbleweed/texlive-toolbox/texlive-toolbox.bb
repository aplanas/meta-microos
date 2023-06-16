SUMMARY = "Tool macros"
DESCRIPTION = "A package for (La)TeX which provides some macros which are \
convenient for writing indexes, glossaries, or other macros. It \
contains macros which support: implicit macros; fancy optional \
arguments; loops over tokenlists and itemlists; searching and \
splitting; controlled expansion; redefinition of macros; and \
concatenated macro names; macros for text replacement."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn32260"

RPM_NAME = "texlive-toolbox-2023.201.5.1svn32260-52.1.noarch.rpm"
RPM_HASH = "90aadf467c89eca9bacb348b0b08cdd6b1e6576d0289bc770e1d276378957081d2008666bf998a16a14f11c59fd5c00423612d398a074fb5fe5492753efbc3e5"
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
