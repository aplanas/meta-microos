SUMMARY = "Itrans input maps for use with XeLaTeX"
DESCRIPTION = "The package provides maps for use with XeLaTeX with coding done \
using itrans. Fontspec maps are provided for Devanagari \
(Sanskrit), for Sanskrit in Kannada and for Kannada itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-2023.201.4.2svn55475-52.1.noarch.rpm"
RPM_HASH = "12a19aca07df5e2b42420dea9c19a49c48a5bf930120948f08dff20531a1b77277d9d9151d39b66eb9a825ccd5926aaadc2b7150dca034ebeff68a84c098acfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(brh-kan.map) \
tex(itrans-dvn.map) \
tex(itrans-iast.map) \
tex(itrans-kan.map) \
tex(itrans-sankan.map) \
tex(itrans-santel.map) \
tex(itrans-sdvn.map) \
tex(itrans-tamil.map) \
tex(itrans-tel.map) \
texlive-xetex-itrans"

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
