SUMMARY = "Print topical diagrams"
DESCRIPTION = "The package facilitates the creation of 'topical schemata', \
i.e. outlines that use braces (or facsimiles thereof) to \
illustrate the breakdown of concepts and categories in \
Scholastic thought from late medieval and early modern periods."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn58020"

RPM_NAME = "texlive-schemata-2023.209.1.4svn58020-54.1.noarch.rpm"
RPM_HASH = "f80887a370585b2a5922d957b39c3b47dca6da0bc8ce4911c62d2c9c8b8d8a4e7e4d8f07e964d5e81e7f663dd5cd25f231216267218cf1f25918508289630994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schemata.sty \
texlive-schemata"

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
