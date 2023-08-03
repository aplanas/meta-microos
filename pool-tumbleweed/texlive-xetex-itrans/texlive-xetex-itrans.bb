SUMMARY = "Itrans input maps for use with XeLaTeX"
DESCRIPTION = "The package provides maps for use with XeLaTeX with coding done \
using itrans. Fontspec maps are provided for Devanagari \
(Sanskrit), for Sanskrit in Kannada and for Kannada itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-2023.209.4.2svn55475-53.1.noarch.rpm"
RPM_HASH = "149ec78bfaef2467c4320c1763c2cd27b933f7dd4a1d5b319bbbbbafedc49065273bbde9dfb0c484f8f82ea349b473e3cca9bce1cb232d014d062797aac8095e"
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
