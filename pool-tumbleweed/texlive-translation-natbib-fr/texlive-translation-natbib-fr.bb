SUMMARY = "French translation of the documentation of natbib"
DESCRIPTION = "A French translation of the documentation of natbib."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25105"

RPM_NAME = "texlive-translation-natbib-fr-2023.209.svn25105-53.1.noarch.rpm"
RPM_HASH = "820f824ff94fea2409b089e183a9c7d3b0939d591fa90dc85f7388f95b5bfb7acfcf87a471ba5eab89a7ac506169d05467c1c645c0774b87c1e8c3f85e1388b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-natbib-fr"

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
