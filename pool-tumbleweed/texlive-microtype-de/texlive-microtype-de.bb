SUMMARY = "Translation into German of the documentation of microtype"
DESCRIPTION = "The microtype-de package"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn54080"

RPM_NAME = "texlive-microtype-de-2023.209.2.4svn54080-55.1.noarch.rpm"
RPM_HASH = "62202a02ecb6ab93975c98aa269a8a0c139c969373f7b4ad4797cbaa80a42b7a2eb5ad8916fbcbc3eda1edf8a699a3b4a476702b8ab954d2feddb80cc914a96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-de"

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
