SUMMARY = "Combine LaTeX commands over included graphics"
DESCRIPTION = "The overpic environment is a cross between the LaTeX picture \
environment and the \\includegraphics command of graphicx. The \
resulting picture environment has the same dimensions as the \
included graphic. LaTeX commands can be placed on the graphic \
at defined positions; a grid for orientation is available."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53889"

RPM_NAME = "texlive-overpic-2023.201.1.3svn53889-51.1.noarch.rpm"
RPM_HASH = "cc518b433f8931fb820ad5d819e867766508acbdf0f512e120b19e5da484e48641680df62c68c12515c2597abd27e683c2d22a25eb023f394d9b8af5c2ca9e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overpic.sty \
texlive-overpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epic.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
