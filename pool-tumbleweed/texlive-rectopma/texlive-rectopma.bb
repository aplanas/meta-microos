SUMMARY = "Recycle top matter"
DESCRIPTION = "Saves the arguments of \\author and \\title for reference (after \
\\maketitle) in a document. (\\maketitle simply disposes of the \
information, in the standard classes and some others.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19980"

RPM_NAME = "texlive-rectopma-2023.209.svn19980-54.2.noarch.rpm"
RPM_HASH = "1037d0400883cc8055c21d5843ec3b03d3219562e34ce315d6ff9b9e49945c384191c6462bf303a26736a333a977e6b2b3ecdf77ee222a461300441a7976b2ac"
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
