SUMMARY = "Components of TeX"
DESCRIPTION = "An introduction to the components and files users of TeX may \
encounter."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn63184"

RPM_NAME = "texlive-components-2023.209.svn63184-54.1.noarch.rpm"
RPM_HASH = "a84f2556b4b8e0ec430ab1da6bc254ed4294da25c395eeaa66f14a5ce1b19fd38b0d3f02dc40be603472058a175d1518a2363733d08a25978f618f75f6f4d78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-components"

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
