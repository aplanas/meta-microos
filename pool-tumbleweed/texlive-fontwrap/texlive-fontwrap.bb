SUMMARY = "Bind fonts to specific unicode blocks"
DESCRIPTION = "The package (which runs under XeLaTeX) lets you bind fonts to \
specific unicode blocks, for automatic font tagging of \
multilingual text. The package uses Perl (via perltex) to \
construct its tables."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fontwrap-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "12222d059e28a7b0e25ed663a9009dc715915309248b7a26079a5258114391148de150a64f1b9322a00f706b794f4b33f99d002bf978bc6969d15fc10dffdd46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontwrap.sty \
texlive-fontwrap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-perltex.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
