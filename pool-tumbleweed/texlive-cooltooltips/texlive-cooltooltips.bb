SUMMARY = "Associate a pop-up window and tooltip with PDF hyperlinks"
DESCRIPTION = "The cooltooltips package enables a document to contain \
hyperlinks that pop up a brief tooltip when the mouse moves \
over them and also open a small window containing additional \
text. cooltooltips provides the mechanism used by the Visual \
LaTeX FAQ to indicate the question that each hyperlink answers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-2023.209.1.1svn60201-55.1.noarch.rpm"
RPM_HASH = "a8c9e4fb37a00f86a921b3df78cb9f4c7eb993bd9a0561b28b52d0e5c4570139cc7f13717f07ee27e1aba0664787865ae9a4d78eecea9ede730ff3c91a7782bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooltooltips.sty \
texlive-cooltooltips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
