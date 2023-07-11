SUMMARY = "Recycle top matter"
DESCRIPTION = "Saves the arguments of \\author and \\title for reference (after \
\\maketitle) in a document. (\\maketitle simply disposes of the \
information, in the standard classes and some others.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19980"

RPM_NAME = "texlive-rectopma-2023.201.svn19980-53.2.noarch.rpm"
RPM_HASH = "2021ccc52594ec1d6fc3db659b8146cdc9d6eeb4e7f27f42a24c8a8747c4053e83afad57da4ab298ed10d00c39e9d2db0281d8a4a2ebcc9e30faab5a6be7c5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rectopma.sty \
texlive-rectopma"

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
