SUMMARY = "Conditionally include text"
DESCRIPTION = "Defines macros \\includeversion{NAME} and \\excludeversion{NAME}, \
each of which defines an environment NAME whose text is to be \
included or excluded from compilation. Although the command \
syntax is very similar to that of comment, comment.sty is to be \
preferred to version.sty for documents where significant chunks \
of text may be excluded."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn21920"

RPM_NAME = "texlive-version-2023.209.2.0svn21920-54.1.noarch.rpm"
RPM_HASH = "087a1529be71a885fe003d8f86642a9cb45cba817a1db66056ddecf3da4acdd64edd6031eead468a1859d6c657fca05c34754f6b5995ea8a6b4044eb79380c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-version.sty \
texlive-version"

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
