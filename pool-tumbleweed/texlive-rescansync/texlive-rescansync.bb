SUMMARY = "Re-scan tokens with synctex information"
DESCRIPTION = "Allow users to execute saved code to typeset text while \
preserving SyncTeX information."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-2023.209.0.0.0.0svn63856-54.1.noarch.rpm"
RPM_HASH = "130f6156b7e76a0c72b0438d17d8783e8eed586ca1c9116b6b004962220784fe72cdd5d3559d57f937454fe0fc015af08fa63306b8df24f0c900d09c61b725b0"
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
