SUMMARY = "Syntax highlighting for LaTeX"
DESCRIPTION = "This package provides extensive colored syntax highlighting for \
LaTeX. For this purpose it builds on the generic listings \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58392"

RPM_NAME = "texlive-highlightlatex-2023.209.svn58392-54.1.noarch.rpm"
RPM_HASH = "9458e554c792cdc0455c9d0231606b3f8afea035a62d545c9d73c82539e5a1750c6307193058c4a90aa6115844227d77adb38cb5320951ec6e222af3c7bedef4"
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
