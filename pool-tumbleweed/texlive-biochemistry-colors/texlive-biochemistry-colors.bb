SUMMARY = "Colors used to display amino acids, nucleotides, sugars or atoms in biochemistry"
DESCRIPTION = "Biochemistry-colors.sty defines the standard colors of \
biochemistry for use with the color package and the xcolor \
package. xcolor is loaded by Biochemistry-colors.sty. Colors \
include: Shapely-colors for amino acids and nucleotides. \
CPK-Colors (Corey, Pauling and Koltun) of elements. Jmol-colors \
of elements, important isotopes and structures. Glycopedia \
colors for sugars."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-2023.209.1.00svn54512-54.1.noarch.rpm"
RPM_HASH = "a4a9f08430f1b6ae8b743d14dd11453f8036dce36c853327ac2d4dc3f0acd4f98800143edd87b71164170df31ae273bfa9c81f0352e202e52bfc61a89af7e96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Biochemistry-colors.sty \
texlive-biochemistry-colors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
