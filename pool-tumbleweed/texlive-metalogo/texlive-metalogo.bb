SUMMARY = "Extended TeX logo macros"
DESCRIPTION = "This package exposes spacing parameters for various TeX logos \
to the end user, to optimise the logos for different fonts. \
Written especially for XeLaTeX users."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn18611"

RPM_NAME = "texlive-metalogo-2023.209.0.0.12svn18611-55.1.noarch.rpm"
RPM_HASH = "3aa38f229106c8de42b94556dac0cd3bbd1561955f45a4957aa13c63d23754c842033ebd837839d2c117e1ca132fc14f1be6c2fe16c9209b5e46735d9455305d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metalogo.sty \
texlive-metalogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
