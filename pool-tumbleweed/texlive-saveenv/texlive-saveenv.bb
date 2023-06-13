SUMMARY = "Save environment content verbatim"
DESCRIPTION = "This package provides tools to create your own verbatim \
environments, and works for all values of \\endlinechar."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn65346"

RPM_NAME = "texlive-saveenv-2023.201.0.0.0.1svn65346-53.1.noarch.rpm"
RPM_HASH = "d69afc7c6e8e84ee5e32b6aab4ebb658c07b8dde4f53da294a9419a85e98680163744586f067972eec506a1b7ca17ac9d1e09ceea0bffbd7f8891fa16cca63e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(saveenv.sty) \
texlive-saveenv"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(precattl.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
