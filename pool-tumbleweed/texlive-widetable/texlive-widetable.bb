SUMMARY = "An environment for typesetting tables of specified width"
DESCRIPTION = "The package defines a new environment that, unlike tabularX, \
typesets a table of specified width by working on the \
inter-column glue; the tabular cells will all be stretched (or \
shrunk) according to need. The package will use the e-TeX \
arithmetic extensions if they are available (they are, in most \
modern distributions)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn53409"

RPM_NAME = "texlive-widetable-2023.209.2.1svn53409-54.1.noarch.rpm"
RPM_HASH = "a9de4f61740da21c780c15fe0f8946cc4f5508e19f6b74c618262be4bd199beb2129b1f5917c5774e898e4a799fa55204c7d080ac9e63d2698750872f57b0cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-widetable.sty \
texlive-widetable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
