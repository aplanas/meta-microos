SUMMARY = "Re-scan tokens with synctex information"
DESCRIPTION = "Allow users to execute saved code to typeset text while \
preserving SyncTeX information."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-2023.201.0.0.0.0svn63856-53.1.noarch.rpm"
RPM_HASH = "6ef8958d515f88589c4bc97196af469ba145884522e621ce488dfaaddd0f5749bba5a171867c310e8ea0d9563d6fc5f80a9b5c6725b4f068197b9a3a3428906a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rescansync.sty \
texlive-rescansync"

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
