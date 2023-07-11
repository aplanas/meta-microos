SUMMARY = "Re-scan tokens with synctex information"
DESCRIPTION = "Allow users to execute saved code to typeset text while \
preserving SyncTeX information."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-2023.201.0.0.0.0svn63856-53.2.noarch.rpm"
RPM_HASH = "d9e848253fe069237c4ba9b12d7a810d9f524b7fdf9806c9cdc0481fbc1067b0f59f57543c3aa10412402bc3e203576a303cb72b770f486d5c882e4117d98e79"
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
