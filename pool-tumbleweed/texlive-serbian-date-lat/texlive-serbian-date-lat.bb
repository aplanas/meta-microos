SUMMARY = "Updated date typesetting for Serbian"
DESCRIPTION = "Babel defines dates for Serbian texts, in Latin script. The \
style it uses does not match current practices. The present \
package defines a \\date command that solves the problem."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23446"

RPM_NAME = "texlive-serbian-date-lat-2023.201.svn23446-53.1.noarch.rpm"
RPM_HASH = "7ddecd1e8d1f11ace3ecc82995cc9994557976f4f8e09e4a1793ef8abbaa27249f047b5fcb91326ec252af920354b51c76d7875d7dd3f0e86c62bf66576025e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(serbian-date-lat.sty) \
texlive-serbian-date-lat"

RDEPENDS:${PN} += "/bin/sh \
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
