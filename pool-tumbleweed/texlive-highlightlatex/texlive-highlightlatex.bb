SUMMARY = "Syntax highlighting for LaTeX"
DESCRIPTION = "This package provides extensive colored syntax highlighting for \
LaTeX. For this purpose it builds on the generic listings \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58392"

RPM_NAME = "texlive-highlightlatex-2023.201.svn58392-53.2.noarch.rpm"
RPM_HASH = "0b854d9999e3f6adf42b9872aac30bbdf96662a8e3b60097a7327f5f781a1172b20baea17f8338765814d8f490776ce37b22a854cd310c8c3202ac52e49fa399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-highlightlatex.sty \
texlive-highlightlatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-listings.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
