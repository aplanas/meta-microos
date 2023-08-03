SUMMARY = "Babel contributed support for Danish"
DESCRIPTION = "The package provides a language definition, file for use with \
babel, which establishes Danish conventions in a document (or a \
subset of the conventions, if Danish is not the main language \
of the document)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3ssvn57642"

RPM_NAME = "texlive-babel-danish-2023.209.1.3ssvn57642-54.1.noarch.rpm"
RPM_HASH = "6a4b7d4e609ec1fd0d73a699113ea07d827057ff21a74207c0f9743da854592e38817e0dbe638ce30fd1010bce93f0d3cd886c835ea5bfe5f8202e372a73e391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-danish.ldf \
texlive-babel-danish"

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
