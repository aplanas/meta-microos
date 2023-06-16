SUMMARY = "Print topical diagrams"
DESCRIPTION = "The package facilitates the creation of 'topical schemata', \
i.e. outlines that use braces (or facsimiles thereof) to \
illustrate the breakdown of concepts and categories in \
Scholastic thought from late medieval and early modern periods."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn58020"

RPM_NAME = "texlive-schemata-2023.201.1.4svn58020-53.1.noarch.rpm"
RPM_HASH = "66243ffe74f41545bf730c29b78040e4053db2d4be531c8f66f9fec90f24c5d0dc99ded8bbb7e26abe90026e61b18dc5e5465f1bfd84e128cf0e26014b340db6"
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
