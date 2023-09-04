SUMMARY = "Reference documentation of XeTeX"
DESCRIPTION = "The package comprises reference documentation for XeTeX \
detailing its extended features."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65987"

RPM_NAME = "texlive-xetexref-2023.209.svn65987-53.2.noarch.rpm"
RPM_HASH = "b35d6470c69f61250ff1831d891c4662a4176a72363c9d7e312dbc27a62db4b388453ce5b761ac69dcca35f21e79e8346ff4b41c96b3b9fd1425ad982dff3244"
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
