SUMMARY = "English translation of 'Obsolete packages and commands'"
DESCRIPTION = "English translation of the l2tabu practical guide to LaTeX2e by \
Mark Trettin. A list of obsolete packages and commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.8.5.7svn15878"

RPM_NAME = "texlive-l2tabu-english-2023.209.1.8.5.7svn15878-56.1.noarch.rpm"
RPM_HASH = "00888d18df5c8e683922917b3866a221ced4c8b4e4b6f823f598a8f7384948a172b1d8f1f67468883aa22f306615e09a8ed24ce391c6f479b5e2625eb827a0b8"
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
