SUMMARY = "Philological typesetting of classical Greek"
DESCRIPTION = "An extension to babel greek option for typesetting classical \
Greek with a philological approach. The package works with the \
author's greek fonts using the 'Lispiakos' font shape derived \
from that of the fonts used in printers' shops in Lispia. The \
package name honours the publisher B.G. Teubner \
Verlaggesellschaft whose Greek text publications are of high \
quality."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.7.3svn64600"

RPM_NAME = "texlive-teubner-2023.209.5.7.3svn64600-55.1.noarch.rpm"
RPM_HASH = "7b12de7e0358c415b5206acf577ca6c0d809f6b6578a8204c06309512dfabac22ed7986ac3fa241c9b001c7e477089ae3e947b61a377ffb5283eafc6d960817d"
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
