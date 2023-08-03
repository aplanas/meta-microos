SUMMARY = "Reference documentation of XeTeX"
DESCRIPTION = "The package comprises reference documentation for XeTeX \
detailing its extended features."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65987"

RPM_NAME = "texlive-xetexref-2023.209.svn65987-53.1.noarch.rpm"
RPM_HASH = "358cf1c28a15857fba04853ea47480b4ad41a799cea9bacbebe025ac9829a61d3ab97d79b84c9fe43bd9c25fb6ce90f2f00d89973b18c2c6d84f991a0d53eea9"
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
