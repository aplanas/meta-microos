SUMMARY = "Syntax highlighting for LaTeX"
DESCRIPTION = "This package provides extensive colored syntax highlighting for \
LaTeX. For this purpose it builds on the generic listings \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58392"

RPM_NAME = "texlive-highlightlatex-2023.201.svn58392-53.1.noarch.rpm"
RPM_HASH = "59f99a4c313dc399160b93330db72b326d67a0204a74f3dd808293dff53c5c63f8553ce1a6612e29ab33971b5cd5fd10c08f7020fbecff2eca1604234c824750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(highlightlatex.sty) \
texlive-highlightlatex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(listings.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
