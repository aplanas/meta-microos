SUMMARY = "Sophisticated graphics inclusion in a PDF document"
DESCRIPTION = "The package provides tools for including graphics at the full \
size of the output medium, or for creating 'pages' whose size \
is that of the graphic they contain. A principal use case is \
documents that require inclusion of (potentially many) scans or \
photographs. Bookmarking is especially supported. The tool box \
has basic macros and a 'convenience' user interface that wraps \
\\includegraphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-2023.201.1.2.0svn60810-52.1.noarch.rpm"
RPM_HASH = "a82a688cedcb0f37d9270a42ead9f67ac78f75a507ab402e74a82bc343538f52d219ca8a5acffd73f9e81c1997139683ccf189639fe3d1e646a2ef338ba4a985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(incgraph.sty) \
texlive-incgraph"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
