SUMMARY = "Incremental slides"
DESCRIPTION = "This package allows to write presentations with incremental \
slides. It does not presuppose any specific document class. \
Rather, it is a lightweight alternative to full-fledged \
presentation classes like beamer. The package requires xcolor, \
environ, and pgffor (from the pgf bundle)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn57866"

RPM_NAME = "texlive-overlays-2023.201.2.12svn57866-51.1.noarch.rpm"
RPM_HASH = "d0191674a943415e65b7d291f5c0a62275b0cc4c5c36c0640721c211af4ac04f94d0ca8b8f4a62d3a61d7f947157fb6e6b4f6d88962a75f4068e61290643fa92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(overlays.sty) \
texlive-overlays"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(pgffor.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
