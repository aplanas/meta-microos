SUMMARY = "Itrans input maps for use with XeLaTeX"
DESCRIPTION = "The package provides maps for use with XeLaTeX with coding done \
using itrans. Fontspec maps are provided for Devanagari \
(Sanskrit), for Sanskrit in Kannada and for Kannada itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-2023.201.4.2svn55475-52.2.noarch.rpm"
RPM_HASH = "9e833f501b6aaf6aeea574cbcda23b9b23eba40ad83de66d96ab026e71376550e6a2d3ee2e06aec046c0119298511e20f80d64286595b74a4a3438d6f48a7744"
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
