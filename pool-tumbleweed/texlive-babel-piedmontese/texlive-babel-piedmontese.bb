SUMMARY = "Babel support for Piedmontese"
DESCRIPTION = "The package provides the language definition file for support \
of Piedmontese in babel. Some shortcuts are defined, as well as \
translations to Piedmontese of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-2023.201.1.0svn30282-53.1.noarch.rpm"
RPM_HASH = "5da140139aa75ca3c684406ba2d42a4875a5b96410043312a58b95c059e2761f7dd55f0519fc1bd3aa41799ae5e56e02774c90ca640bda255dcf364b7efe4fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(piedmontese.ldf) \
texlive-babel-piedmontese"

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
