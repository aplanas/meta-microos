SUMMARY = "Draw pie-charts using MetaPost"
DESCRIPTION = "The piechartmp package is an easy way to draw pie-charts with \
MetaPost. The package implements an interface that enables \
users with little MetaPost experience to draw charts. A \
highlight of the package is the possibility of suppressing some \
segments of the chart, thus creating the possibility of several \
charts from the same data."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-2023.209.0.0.3.0svn19440-52.1.noarch.rpm"
RPM_HASH = "071ab988872ce8ac1d07540d84fd38feae0a0a28b8302b3d5ea593620442bc4b11fafeb3265ab1a314b4ac6c4c49e7adb56a6296a026f978bb23f47a9f1f2347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
