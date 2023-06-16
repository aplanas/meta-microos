SUMMARY = "Hyperref aware footnote.sty"
DESCRIPTION = "The footnote package by Mark Wooding dates back to 1997 and has \
not been made hyperref compatible. The aim of the present \
package is to do that."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1esvn60374"

RPM_NAME = "texlive-footnotehyper-2023.201.1.1esvn60374-52.1.noarch.rpm"
RPM_HASH = "9fd2ba4083b10c3503769480e7f796390a8331f9dd5e787e7b0d7fe13090244f21532bd6cb50815441c861896fd7d1a4073bfe2609dda1a1f1c02181ed6d1253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnotehyper.sty \
texlive-footnotehyper"

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
