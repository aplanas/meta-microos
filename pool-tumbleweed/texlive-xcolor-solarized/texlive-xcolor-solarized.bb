SUMMARY = "Defines the 16 colors from Ethan Schoonover's Solarized palette"
DESCRIPTION = "Built on top of the xcolor package, this package defines the \
sixteen colors of Ethan Schoonover's popular color palette, \
Solarized, for use in documents typeset with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-2023.201.0.0.4svn61719-52.1.noarch.rpm"
RPM_HASH = "76e0d9dc830aa2342e3e571343eded437d505ca0a0ddf376c678680110da120c7fd2556e3ccc7d564482deb4775f1fd9fb45bd988e77ad3cb8874fbb119bb967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcolor-solarized.sty) \
texlive-xcolor-solarized"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
