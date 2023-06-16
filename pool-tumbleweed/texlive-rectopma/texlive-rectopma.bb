SUMMARY = "Recycle top matter"
DESCRIPTION = "Saves the arguments of \\author and \\title for reference (after \
\\maketitle) in a document. (\\maketitle simply disposes of the \
information, in the standard classes and some others.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19980"

RPM_NAME = "texlive-rectopma-2023.201.svn19980-53.1.noarch.rpm"
RPM_HASH = "b95481ad99548835552ca2f6a7d57a9ffcadb82754846001ad3f50229a197447bd13e5adda85368aab67e08108e59d5dcfa276246364076772cb6753dc974c2c"
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
