SUMMARY = "The classic version of GFSDidot"
DESCRIPTION = "The classic version of GFSDidot provided for Unicode TeX \
engines."
LICENSE = "OFL-1.1"

PV = "2023.201.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-2023.201.001.001svn52778-52.1.noarch.rpm"
RPM_HASH = "313196968e275866b644bb1d9a0fbbc6c7143e7370b4d1588f34cd4fd79657c500cf183d32b5bdf4ec1e9f86d6811bbc3778bd4352a709abd0abefdbd8b16048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gfsdidotclassic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
