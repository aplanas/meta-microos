SUMMARY = "Sophisticated graphics inclusion in a PDF document"
DESCRIPTION = "The package provides tools for including graphics at the full \
size of the output medium, or for creating 'pages' whose size \
is that of the graphic they contain. A principal use case is \
documents that require inclusion of (potentially many) scans or \
photographs. Bookmarking is especially supported. The tool box \
has basic macros and a 'convenience' user interface that wraps \
\\includegraphics."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.0svn60810"

RPM_NAME = "texlive-incgraph-2023.208.1.2.0svn60810-53.1.noarch.rpm"
RPM_HASH = "c2801876b638107f7bb22f2c541daf1fae006012ec4b78112ebd382a1ca781af10d9a719a2631997b545c46479d12de7cab8264541dbd87784bbad8dbe54c5bc"
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
