SUMMARY = "Creating Venn diagrams with TikZ"
DESCRIPTION = "The package assists generation of simple two- and three-set \
Venn diagrams for lectures or assignment sheets. The package \
requires the TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47952"

RPM_NAME = "texlive-venndiagram-2023.201.1.2svn47952-53.1.noarch.rpm"
RPM_HASH = "f329b31b9a60f785291c730a79c26c63fc2317efd04107e7bed556bcf69b5d095b45f7c1c52889ccbe486a5da331f40fbba3a6c0b18a0813620957a1cad0c005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(venndiagram.sty) \
texlive-venndiagram"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
