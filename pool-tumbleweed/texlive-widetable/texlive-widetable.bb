SUMMARY = "An environment for typesetting tables of specified width"
DESCRIPTION = "The package defines a new environment that, unlike tabularX, \
typesets a table of specified width by working on the \
inter-column glue; the tabular cells will all be stretched (or \
shrunk) according to need. The package will use the e-TeX \
arithmetic extensions if they are available (they are, in most \
modern distributions)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn53409"

RPM_NAME = "texlive-widetable-2023.201.2.1svn53409-53.1.noarch.rpm"
RPM_HASH = "633213ee5a5fa33fc51722c6107b09723c529154774685c37fde04971c72986f3d82580d43eb85140cf3994cdbbe3524ec4c43d12e7c365635331c90d66fc729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(widetable.sty) \
texlive-widetable"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
