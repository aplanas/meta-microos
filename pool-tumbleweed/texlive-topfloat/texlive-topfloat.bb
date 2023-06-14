SUMMARY = "Move floats to the top of the page"
DESCRIPTION = "The topfloat package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19084"

RPM_NAME = "texlive-topfloat-2023.201.svn19084-52.1.noarch.rpm"
RPM_HASH = "9f3aea99239829ae33b2c7527c383fe6423cd0aa41f7fd31d323d6a091e74f20000eb2a1d0812579b1623943e0f3c42f0d37a2e007088a4d9e14f841a89154d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topfloat.sty \
texlive-topfloat"

RDEPENDS:${PN} += "/bin/sh \
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
