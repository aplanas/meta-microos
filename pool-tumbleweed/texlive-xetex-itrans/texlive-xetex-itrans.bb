SUMMARY = "Itrans input maps for use with XeLaTeX"
DESCRIPTION = "The package provides maps for use with XeLaTeX with coding done \
using itrans. Fontspec maps are provided for Devanagari \
(Sanskrit), for Sanskrit in Kannada and for Kannada itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-2023.209.4.2svn55475-53.2.noarch.rpm"
RPM_HASH = "f8d88a61a90de3d782f6328bc585c78cd3762aa627d9425352ac557a4166f5aa9c724a27c4c44e6ee5ed043d5585aa1867a1ded6b805f5532af5debace4a63b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brh-kan.map \
tex-itrans-dvn.map \
tex-itrans-iast.map \
tex-itrans-kan.map \
tex-itrans-sankan.map \
tex-itrans-santel.map \
tex-itrans-sdvn.map \
tex-itrans-tamil.map \
tex-itrans-tel.map \
texlive-xetex-itrans"

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
