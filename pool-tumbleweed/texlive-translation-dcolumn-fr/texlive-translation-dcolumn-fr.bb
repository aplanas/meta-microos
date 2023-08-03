SUMMARY = "French translation of the documentation of dcolumn"
DESCRIPTION = "A French translation of the documentation of dcolumn."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24345"

RPM_NAME = "texlive-translation-dcolumn-fr-2023.209.svn24345-53.1.noarch.rpm"
RPM_HASH = "50534f9a2cf4fcca37104994f0fe701ffffe8e7dc50c4477d89d71cb1dcdb1a4e05430c82f6c08eab166cf29c9c21ddc6af99862f62acd6b217031bda2cb3769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-dcolumn-fr"

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
