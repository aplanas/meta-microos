SUMMARY = "Crop.cfg for XeLaTeX"
DESCRIPTION = "The xetexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45845"

RPM_NAME = "texlive-xetexconfig-2023.209.svn45845-53.2.noarch.rpm"
RPM_HASH = "29852b0081aed88be0d6dba6fc8c07f4f916ca3de33825a464b996779132c164ee6ec3e88294d092652c01f28ae93ff0605c851f3a219ce59de5abf4f08e5736"
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
