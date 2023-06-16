SUMMARY = "Add license data to the bibliography"
DESCRIPTION = "This package is for adding license data to bibliography entries \
via BibLaTeX's built-in related mechanism. It provides a new \
relatedtype license and some bibmacros for typesetting these \
related entries."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-2023.201.0.0.1svn58437-53.1.noarch.rpm"
RPM_HASH = "23d1260407ab1cc908feb5a1ad1e3f680051f6e05b7f03a3a83f697c3466580693ff3029724dbf59bb7148711a6e0cf47a60a69e3406d0dd0ac84caa4c839588"
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
