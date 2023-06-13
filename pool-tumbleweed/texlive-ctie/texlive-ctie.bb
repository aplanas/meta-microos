SUMMARY = "C version of tie (merging Web change files)"
DESCRIPTION = "This is a version of tie converted for use with cweb."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.1.1svn66186"

RPM_NAME = "texlive-ctie-2023.204.1.1svn66186-54.1.noarch.rpm"
RPM_HASH = "230f3d3ad6f8550a2f73f5d1b3a4b40a208e5cd7c29b8de41cf6b08bfd7347c32fa53ed46f6fc6e6a760cb9e709a4ad3c98a42217a57e816a0fd7d9eb06d77e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ctie.1) \
texlive-ctie"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ctie-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
