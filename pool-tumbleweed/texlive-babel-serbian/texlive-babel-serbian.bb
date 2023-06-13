SUMMARY = "Babel/Polyglossia support for Serbian"
DESCRIPTION = "The package provides support for Serbian documents written in \
Latin, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-2023.201.2.2asvn64571-53.1.noarch.rpm"
RPM_HASH = "191460030a7a542807e48339bef3dba15c54959b5a5709eb41953b3207ea5ff61f18876955d34b9cde3f16e8a194b1e2f2d8ee29fc6ec71f4f387dd2a9925da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(serbian.ldf) \
texlive-babel-serbian"

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
