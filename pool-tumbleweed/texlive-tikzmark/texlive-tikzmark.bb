SUMMARY = "Use TikZ's method of remembering a position on a page"
DESCRIPTION = "The tikzmark package defines a command to 'remember' a position \
on a page for later (or earlier) use, primarily (but not \
exclusively) with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn64819"

RPM_NAME = "texlive-tikzmark-2023.209.1.15svn64819-53.1.noarch.rpm"
RPM_HASH = "d28ec37a96da2fc8b5ad02cbd0cfb6e5fc0dc3b066ec56961073600f9efb01d9478362a08eba939da1266c4ef9661d4ddd23328baec76d43b44a2494ccf5e3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytikzmark.code.tex \
tex-tikzmarklibraryams.code.tex \
tex-tikzmarklibraryhighlighting.code.tex \
tex-tikzmarklibrarylistings.code.tex \
texlive-tikzmark"

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
