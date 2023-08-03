SUMMARY = "BibTeX style for AJL"
DESCRIPTION = "Bibliographic style references in style of Australian Journal \
of Linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34016"

RPM_NAME = "texlive-ajl-2023.209.svn34016-55.1.noarch.rpm"
RPM_HASH = "0ffe2163a60ff50285d5c592096befceef33e08aac2f38a7fa837c4dc2004428a02a11943ec6b6f84ded8116c0eb26f300dcfd0d50305c22f4064495741e5910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ajl"

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
