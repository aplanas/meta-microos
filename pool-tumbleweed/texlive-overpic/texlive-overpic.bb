SUMMARY = "Combine LaTeX commands over included graphics"
DESCRIPTION = "The overpic environment is a cross between the LaTeX picture \
environment and the \\includegraphics command of graphicx. The \
resulting picture environment has the same dimensions as the \
included graphic. LaTeX commands can be placed on the graphic \
at defined positions; a grid for orientation is available."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53889"

RPM_NAME = "texlive-overpic-2023.209.1.3svn53889-52.1.noarch.rpm"
RPM_HASH = "40cf620e9414fa4cae4903a0d6082fb4b2322a53c3634d3f37ab8aa3aabbd7c71f2c2914a3b0c06420376b7c824ea128dbd2066274530ba4acf42b335e4a6320"
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
