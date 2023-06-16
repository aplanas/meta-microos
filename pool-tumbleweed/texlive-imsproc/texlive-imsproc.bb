SUMMARY = "Typeset IMS conference proceedings"
DESCRIPTION = "The class typesets papers for IMS (Iranian Mathematical \
Society) conference proceedings. The class uses the XePersian \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-2023.201.0.0.1svn29803-52.1.noarch.rpm"
RPM_HASH = "545c971386f87fae7ce6fe77531db21f965604a521dc635b53755086a163cc6ec4c7870c4d11b70211c7dd885167cf3b2ebaf1ce7a962bd4ee233c63aaa36ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imsproc.cls \
texlive-imsproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
