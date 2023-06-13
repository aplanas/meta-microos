SUMMARY = "Babel support for Scottish Gaelic"
DESCRIPTION = "The package provides the language definition file for support \
of Gaidhlig (Scottish Gaelic) in babel. Some shortcuts are \
defined, as well as translations of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0gsvn30289"

RPM_NAME = "texlive-babel-scottish-2023.201.1.0gsvn30289-53.1.noarch.rpm"
RPM_HASH = "db667cf42cde1e7a0d54fc98944861e8fbf606f03cf6e278a3ea1b9e66c06bbdd3cfd2ea516486221faafc9601f0a6e925cee48d6e33692ff9cd6cb4120d337d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scottish.ldf) \
texlive-babel-scottish"

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
