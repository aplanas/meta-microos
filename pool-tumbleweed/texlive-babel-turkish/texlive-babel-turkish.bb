SUMMARY = "Babel support for Turkish documents"
DESCRIPTION = "The package provides support, within babel, of the Turkish \
language."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-2023.209.1.4svn51560-54.1.noarch.rpm"
RPM_HASH = "1101c8d44f723e0f0f316de6889e419ea56ed4cf6f8bb7bb8df14d01469364d9a377961bde58ac991feb08f0fd61eca1af6a7c8891ad80c1aed9381d28a73eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turkish.ldf \
texlive-babel-turkish"

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
