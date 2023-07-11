SUMMARY = "Grid typesetting in LaTeX"
DESCRIPTION = "The package helps to enables grid typesetting in double column \
documents. Grid typesetting (vertical aligning of lines of text \
in adjacent columns) is a difficult task in LaTeX, and the \
present package is no more than an attempt to help users to \
achieve it in a limited way. An example document, grid.tex, is \
provided with simple instructions to typeset it using the \
package. The package needs a lot more work: this is only a \
beginning..."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-grid-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "096acd284c7568d280bc77983281c5462f5e3a18944247bb7178f9f2a93ca7ee0a167cd535f57d90db42cea13322ea9c15fee679462de74c5e280f9b3e52a0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid.sty \
texlive-grid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
