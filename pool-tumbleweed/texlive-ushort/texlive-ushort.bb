SUMMARY = "Shorter (and longer) underlines and underbars"
DESCRIPTION = "Some engineers need underlined or twice underlined variables \
for which the usual \\underline is too long. This package \
provides a generic command for creating underlines of various \
sizes and types."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn32261"

RPM_NAME = "texlive-ushort-2023.209.2.2svn32261-54.1.noarch.rpm"
RPM_HASH = "d3596cdd0657efbadf48238dcc5724a55c16f81cba7dc5f9733e6bd3809eb45cc7a150866f36aee1f536b2be7be7b512e0772721ae4cb5736186ef00bb272807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ushort.sty \
texlive-ushort"

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
