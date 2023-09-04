SUMMARY = "Re-scan tokens with synctex information"
DESCRIPTION = "Allow users to execute saved code to typeset text while \
preserving SyncTeX information."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-2023.209.0.0.0.0svn63856-54.2.noarch.rpm"
RPM_HASH = "afb6d3a9a777a449bddfcfb949ef19ca910e6aa18687d9e5e142d4e5889d72d809bd82e55efc8c20e910d6b0d1336965d4b7662e59a8eadbffcf160a07849bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rescansync.sty \
texlive-rescansync"

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
