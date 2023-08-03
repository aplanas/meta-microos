SUMMARY = "Recycle top matter"
DESCRIPTION = "Saves the arguments of \\author and \\title for reference (after \
\\maketitle) in a document. (\\maketitle simply disposes of the \
information, in the standard classes and some others.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19980"

RPM_NAME = "texlive-rectopma-2023.209.svn19980-54.1.noarch.rpm"
RPM_HASH = "6758ced051c3f58b3b1339ac4b1ba0dbc31b9528622c55485b4e4eeabba2bab57470c8294f517112217c71cf264978f596171ad2d3d77eebfce19e825a05eb98"
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
