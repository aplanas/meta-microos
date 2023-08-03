SUMMARY = "Babel contributed support for Dutch"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Dutch conventions in a document (or a \
subset of the conventions, if Dutch is not the main language of \
the document)."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.8lsvn60362"

RPM_NAME = "texlive-babel-dutch-2023.209.3.8lsvn60362-54.1.noarch.rpm"
RPM_HASH = "22242cf2e0aaf748c1d5c1bc6be4b50cf01ab236b39af49aaf7a1d8ff3a0e01f39006bfe1b903be98fa55294f8a816a4267169f73c9cb408a0e21e723f4c90b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afrikaans.ldf \
tex-dutch.ldf \
texlive-babel-dutch"

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
