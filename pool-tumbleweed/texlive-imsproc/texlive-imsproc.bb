SUMMARY = "Typeset IMS conference proceedings"
DESCRIPTION = "The class typesets papers for IMS (Iranian Mathematical \
Society) conference proceedings. The class uses the XePersian \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-2023.209.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "bc34d5e4c1e68e5d09b2d11e96de7fd9c2bd8e51b06b6760311e0b5f1d4b34df5354d37446277f8026d2d34caa91d469d877d5ead4b63a24dff683bd2edca41a"
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
