SUMMARY = "Membrane Computing notation"
DESCRIPTION = "This is a LaTeX package for the Membrane Computing community. \
It comprises the definition of P systems, rules and some \
concepts related to languages and computational complexity \
usually needed for Membrane Computing research. The package \
depends on ifthen and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-2023.208.0.0.2.1svn64627-53.1.noarch.rpm"
RPM_HASH = "80ae53928695a6ddd3a405339448b5beee3f6db7d40208b4887672d2267d5e4604835de66facc6c265ad09b2ae08657831946e437a71daca6ea7e42f8f26d165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-membranecomputing.sty \
texlive-membranecomputing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
