SUMMARY = "A manual about bibliographies and especially BibTeX"
DESCRIPTION = "An (as-complete-as-possible) manual about bibliographies in \
LaTeX, and thus mainly about BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-tamethebeast-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "d55bb8694259b5d468c5882e57c1cd66c4a9ab5b967a1b2fcb5214b095943024cdc93aeec148431ef8a88a39fc3d63b1c06463c73bf9b0f86b7b856ac885c8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamethebeast"

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
