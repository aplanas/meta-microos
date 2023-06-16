SUMMARY = "BibTeX style for AJL"
DESCRIPTION = "Bibliographic style references in style of Australian Journal \
of Linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34016"

RPM_NAME = "texlive-ajl-2023.201.svn34016-54.1.noarch.rpm"
RPM_HASH = "4d93e61a2038c787dcf27562339ed50116c12fa6de79bb569bae5ee30fc58dfc7d309205b744c2a1964e194a355e751ae8a28a533bd7514bd4e6b781f79bd580"
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
