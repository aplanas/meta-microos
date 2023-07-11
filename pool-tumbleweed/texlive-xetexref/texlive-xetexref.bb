SUMMARY = "Reference documentation of XeTeX"
DESCRIPTION = "The package comprises reference documentation for XeTeX \
detailing its extended features."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65987"

RPM_NAME = "texlive-xetexref-2023.201.svn65987-52.2.noarch.rpm"
RPM_HASH = "62d31f022501a0756233dc4cee6220b5c84f4eab360d43ea2562f3441f3a5a2589ba69206a991c17ae4e7d93758a6f748d80046989f68ef45633e26c47480520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexref"

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
