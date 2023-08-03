SUMMARY = "Data merging for automatic document creation"
DESCRIPTION = "The package handles csv data merging for automatic document \
creation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn51306"

RPM_NAME = "texlive-context-handlecsv-2023.209.svn51306-55.1.noarch.rpm"
RPM_HASH = "d7e7a6f151ccb84c32e15730a78c5b8dcf9bcf4489907ce5352f456efa7a1f51c42517c908237cdae2e379c4fc0bfffdadefe6f058e0aed09811b8d41d2424ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-handlecsv.tex \
texlive-context-handlecsv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
