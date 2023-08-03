SUMMARY = "Babel contributed support for Catalan"
DESCRIPTION = "The package establishes Catalan conventions in a document (or a \
subset of the conventions, if Catalan is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2psvn30259"

RPM_NAME = "texlive-babel-catalan-2023.209.2.2psvn30259-54.1.noarch.rpm"
RPM_HASH = "7e5bcb37329f655a60740cb87ce42a63ff2652c085f025cdaffd4a49cece36da1c76141fe0749434cda799e5a342abd60f45d8c9acd8787f67bab64190aee16d"
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
