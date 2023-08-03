SUMMARY = "Add license data to the bibliography"
DESCRIPTION = "This package is for adding license data to bibliography entries \
via BibLaTeX's built-in related mechanism. It provides a new \
relatedtype license and some bibmacros for typesetting these \
related entries."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-2023.209.0.0.1svn58437-54.1.noarch.rpm"
RPM_HASH = "6d2a3f304aa950a511c9a3d9bcd3170968d371276106db7dc58df405015a6c73f8c1d55ad3228b95005c615dc4ad250e16015d0e449432a66570f653302e3b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-license.sty \
texlive-biblatex-license"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
