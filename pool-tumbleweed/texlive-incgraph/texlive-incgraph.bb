SUMMARY = "Sophisticated graphics inclusion in a PDF document"
DESCRIPTION = "The package provides tools for including graphics at the full \
size of the output medium, or for creating 'pages' whose size \
is that of the graphic they contain. A principal use case is \
documents that require inclusion of (potentially many) scans or \
photographs. Bookmarking is especially supported. The tool box \
has basic macros and a 'convenience' user interface that wraps \
\\includegraphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-2023.209.1.2.0svn60810-54.1.noarch.rpm"
RPM_HASH = "3450122990b9006422449fff679cd2b06943df4fec3faccddcc344d15eacefb2c3c20ef8f8966d96e024651833da8149cbaad4fc558550db023f88db91a4c490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-incgraph.sty \
texlive-incgraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
