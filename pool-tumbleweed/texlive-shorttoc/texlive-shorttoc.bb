SUMMARY = "Table of contents with different depths"
DESCRIPTION = "A package to create another table of contents with a different \
depth, useful in large documents where a detailed table of \
contents should be accompanied by a shorter one, giving only a \
general overview of the main topics in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-shorttoc-2023.201.1.3svn15878-53.1.noarch.rpm"
RPM_HASH = "0554e7a66d7e950f9677374cc4ecdcb3b249a7981656c3e9e93dde844d0612e1f01221301f88c24df61f212f307aae050e3fd94bc4fd1c73a31ee25b7174468f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(shorttoc.sty) \
texlive-shorttoc"

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
