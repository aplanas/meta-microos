SUMMARY = "Ukrainian version of the LaTeX introduction"
DESCRIPTION = "Ukrainian version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.00svn55643"

RPM_NAME = "texlive-lshort-ukr-2023.208.4.00svn55643-53.1.noarch.rpm"
RPM_HASH = "a691d650b65fe8397be642a26a80452b519c93a97d3daa990ef2744af2bad0864c0ee446ee16c0da8376704c8ecfbdd578518d182ab68df386eff34f25668ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-ukr"

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
