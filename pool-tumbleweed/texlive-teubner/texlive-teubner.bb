SUMMARY = "Philological typesetting of classical Greek"
DESCRIPTION = "An extension to babel greek option for typesetting classical \
Greek with a philological approach. The package works with the \
author's greek fonts using the 'Lispiakos' font shape derived \
from that of the fonts used in printers' shops in Lispia. The \
package name honours the publisher B.G. Teubner \
Verlaggesellschaft whose Greek text publications are of high \
quality."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.7.3svn64600"

RPM_NAME = "texlive-teubner-2023.201.5.7.3svn64600-54.1.noarch.rpm"
RPM_HASH = "fc932aa4d85216b308aaf3223f02375904f7af3df19f10a97c4d1b50c67120dc6d5f7d1ede7d1a9e81b9bc56d2c4ce0c17ff10a9d752a8923d910b9e6f448541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-teubner.sty \
tex-teubnertx.sty \
texlive-teubner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-exscale.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-ot1cmr.fd \
tex-textalpha.sty \
tex-trace.sty \
tex-ts1pxr.fd \
tex-ts1txr.fd \
tex-type1ec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
