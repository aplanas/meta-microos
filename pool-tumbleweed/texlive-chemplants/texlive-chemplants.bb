SUMMARY = "Symbology to draw chemical plants with TikZ"
DESCRIPTION = "This package offers tools to draw simple or barely complex \
schemes of chemical processes. The package defines several \
standard symbols and styles to draw process units and streams. \
The guiding light of the package is the UNICHIM regulation. All \
of the symbols and styles are defined using tools of the TikZ \
package, thus a basic knowledge of the logic of this powerful \
tool is required to profitably use chemplants."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-2023.209.0.0.9.9svn60606-54.1.noarch.rpm"
RPM_HASH = "d5bdd8777406216751d076254587bf65f2814c3a870c53d8209d053d5a4a171e95f30659c505ade85353b3bfc71d45bf04c346b891b973315ddc83d5d96d1f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemplants.sty \
texlive-chemplants"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
