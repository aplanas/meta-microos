SUMMARY = "Symbology to draw chemical plants with TikZ"
DESCRIPTION = "This package offers tools to draw simple or barely complex \
schemes of chemical processes. The package defines several \
standard symbols and styles to draw process units and streams. \
The guiding light of the package is the UNICHIM regulation. All \
of the symbols and styles are defined using tools of the TikZ \
package, thus a basic knowledge of the logic of this powerful \
tool is required to profitably use chemplants."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.9svn60606"

RPM_NAME = "texlive-chemplants-2023.201.0.0.9.9svn60606-53.1.noarch.rpm"
RPM_HASH = "e727f64bca76ece40a1f4c34aa6b1f7db735355befc8d2de5235e70c606b14f510b223b4a32699606e10b3c6f8e0afae4450423719ba3c5bd76ab6e8d9542eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemplants.sty \
texlive-chemplants"

RDEPENDS:${PN} += "/bin/sh \
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
