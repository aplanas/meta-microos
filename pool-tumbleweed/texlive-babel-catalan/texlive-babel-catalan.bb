SUMMARY = "Babel contributed support for Catalan"
DESCRIPTION = "The package establishes Catalan conventions in a document (or a \
subset of the conventions, if Catalan is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-2023.201.2.2psvn30259-53.1.noarch.rpm"
RPM_HASH = "79b0bbaa1d6519fcbdf99873538eee5fb6b2d813634c104e0494c93bcd7018d6bd6c4eb0d47e8a4528c429a0dc0586c3a619e4cdebfe05b141ad088dfe37d360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catalan.ldf \
texlive-babel-catalan"

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
