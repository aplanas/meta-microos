SUMMARY = "Italian translation of amsldoc"
DESCRIPTION = "The amsldoc-it package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45662"

RPM_NAME = "texlive-amsldoc-it-2023.201.svn45662-54.1.noarch.rpm"
RPM_HASH = "68c7dfd59673c5e152a4b3d8b87d45b4a06b4dfe7cdedc71bd50b4dd1137fdb4f0d4397425f0ad4573977da4d27591afe3ede7f4d491b0049c7c4ddcdfcff66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsldoc-it"

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
