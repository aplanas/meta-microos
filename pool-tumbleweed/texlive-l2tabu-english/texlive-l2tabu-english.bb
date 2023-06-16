SUMMARY = "English translation of 'Obsolete packages and commands'"
DESCRIPTION = "English translation of the l2tabu practical guide to LaTeX2e by \
Mark Trettin. A list of obsolete packages and commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.8.5.7svn15878"

RPM_NAME = "texlive-l2tabu-english-2023.201.1.8.5.7svn15878-55.1.noarch.rpm"
RPM_HASH = "92eb9247c9a5bd442c76aac484c3bfcb14dafb34fc9661bdd44146f4d3d0376f096dc9e96ecc2484483ac6e7aeab5180ebf0dab5a7a96908e5c0a37ab8018289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-english"

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
