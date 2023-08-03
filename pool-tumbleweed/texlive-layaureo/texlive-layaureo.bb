SUMMARY = "A package to improve the A4 page layout"
DESCRIPTION = "This package produces a wide page layout for documents that use \
A4 paper size. Moreover, LayAureo provides both a simple hook \
for leaving an empty space which is required if pages are \
bundled by a press binding (use option binding=length), and an \
option called big which it forces typearea to become maximum."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-2023.209.0.0.2svn19087-55.1.noarch.rpm"
RPM_HASH = "f8bded168d4e0eda4c588446264f2de1756621d7cce69d111786233c89bf191dfe247d8aa7fc7fc7e125241344b0a3dd6da00c4f97b6d3b8b99fbe19978e9fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-layaureo.sty \
texlive-layaureo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-geometry.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
