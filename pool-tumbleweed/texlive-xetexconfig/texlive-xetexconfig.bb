SUMMARY = "Crop.cfg for XeLaTeX"
DESCRIPTION = "The xetexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45845"

RPM_NAME = "texlive-xetexconfig-2023.209.svn45845-53.1.noarch.rpm"
RPM_HASH = "d7b4efd0a2ececab3815c65c8835c7b8079fcc9b629ae2c7bc6c0e668ee914a43c4645f5925843bb05316de6295542dd8be426ee4185520d447b803b4b1a92f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crop.cfg \
texlive-xetexconfig"

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
