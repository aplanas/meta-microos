SUMMARY = "Keeping track of document versions"
DESCRIPTION = "The package enables the user to keep track of different \
versions of a LaTeX document. The command \\version prints the \
version and build numbers; each time you compile your document, \
the build number is increased by one. By placing \\version in \
the header or footer, each page can be marked with the unique \
build number describing the progress of your document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn29370"

RPM_NAME = "texlive-mversion-2023.201.1.0.1svn29370-54.1.noarch.rpm"
RPM_HASH = "7347f6b7d5812a12c8dcc16fc5cbb501a5cc1db81fba4db2f79703cf1a8a01a15258163076aa2c88d7241021a8d7876fb09f5f3d5c5cb4426bf9897ee727d322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mVersion.sty \
texlive-mversion"

RDEPENDS:${PN} += "/bin/sh \
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
