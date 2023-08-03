SUMMARY = "The classic version of GFSDidot"
DESCRIPTION = "The classic version of GFSDidot provided for Unicode TeX \
engines."
LICENSE = "OFL-1.1"

PV = "2023.209.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-2023.209.001.001svn52778-53.1.noarch.rpm"
RPM_HASH = "67db6a28aa3ca926e4c14d1ef301be51eec5f4724f775ae182f7f01470087a2f2df55b2cce07e7b2aeb9309813b29a3de81a4eecf3222751dfb8ab2ae7c6f249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
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
