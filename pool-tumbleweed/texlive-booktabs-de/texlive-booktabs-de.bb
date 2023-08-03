SUMMARY = "German version of booktabs"
DESCRIPTION = "This is a 'translation' of the booktabs."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.61803svn21907"

RPM_NAME = "texlive-booktabs-de-2023.209.1.61803svn21907-53.1.noarch.rpm"
RPM_HASH = "b6064d5702c31edd69ff8b4af84dd7eb641a5c8e7d86fb5ae173577a3d37751e26b352737d20c5d9ecd79d02d860d9d2babce9adf8d5c60c12af700748550474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-de"

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
