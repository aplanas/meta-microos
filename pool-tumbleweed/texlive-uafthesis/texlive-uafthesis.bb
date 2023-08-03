SUMMARY = "Document class for theses at University of Alaska Fairbanks"
DESCRIPTION = "This is an 'unofficial' official class."
LICENSE = "LPPL-1.0"

PV = "2023.209.12.12svn57349"

RPM_NAME = "texlive-uafthesis-2023.209.12.12svn57349-53.1.noarch.rpm"
RPM_HASH = "7abd1041ee31f5f54b7f6045a479f9e4f00c8612c59279cec34824a3bd0df9163019e00cb18890491cbec15fe4ee5ace74190cf8bec393368776491889ba8b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uafthesis.cls \
texlive-uafthesis"

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
