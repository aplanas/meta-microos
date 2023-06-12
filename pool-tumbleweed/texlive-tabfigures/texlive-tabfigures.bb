SUMMARY = "Maintain vertical alignment of figures"
DESCRIPTION = "Knuth designed his original fonts with tabular figures (figures \
whose width is uniform); this makes some layout problems rather \
simple. In more recent times, fonts (such as Minion Pro), which \
offer proportionally spaced figures, are increasingly being \
used. The package provides mechanisms whereby such proportional \
figures may still be aligned in tabular style (for example, in \
the table of contents)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn25202"

RPM_NAME = "texlive-tabfigures-2023.201.1.1svn25202-57.1.noarch.rpm"
RPM_HASH = "8ac3f3d870fe9d59a4aa1cb79cb6cafb7199ae78f4d6b22f4d292bd8e564ebb8c1e7e059b62b79475e87713c2441c4f8f34a4e09003819dc3c6da2cf861376a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabfigures.sty) \
texlive-tabfigures"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
