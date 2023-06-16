SUMMARY = "Visual help for PSTricks based on images with minimum text"
DESCRIPTION = "Visual help for PSTricks based on images with minimum text. One \
image per command or per parameter."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn39799"

RPM_NAME = "texlive-visualpstricks-2023.201.2.3svn39799-53.1.noarch.rpm"
RPM_HASH = "3040d3c17cb1a77c0193d739c45a5dce6602b941979f1df5eca6ec436d86e7700fb28f45381abd977da2993dfab1fd12ef9121fd9f4c7d7c931dd65959b82c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualpstricks"

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
