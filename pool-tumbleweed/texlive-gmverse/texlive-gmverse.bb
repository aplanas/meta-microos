SUMMARY = "A package for typesetting (short) poems"
DESCRIPTION = "A redefinition of the verse environment to make the \\\\ command \
optional for line ends and to give it a possibility of optical \
centering and `right-hanging' alignment of lines broken because \
of length."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-2023.209.0.0.73svn29803-54.2.noarch.rpm"
RPM_HASH = "af367902fc289d3983f6b6068d9dc0c6176780effb01011a443cc5456f1827aea4696c129d64c4b03eb46d5fee836aeefb2bb36b5944a529349f3a3fcdc1007f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmverse.sty \
texlive-gmverse"

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
