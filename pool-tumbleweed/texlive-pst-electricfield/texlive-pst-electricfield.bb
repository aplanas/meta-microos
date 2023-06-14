SUMMARY = "Draw electric field and equipotential lines with PSTricks"
DESCRIPTION = "The package provides macros to plot electric field and \
equipotential lines using PStricks. There may be any number of \
charges which can be placed in a cartesian coordinate system by \
(x,y) values."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-2023.201.0.0.14svn29803-52.1.noarch.rpm"
RPM_HASH = "5b7569e91ec6dfdb6c7b7e9fe2ad2b8cba679fe0148d32f35511c9df8b4317db3607f1ffe5774d00d381308df0484f8bbf15c1122b0f67e680a38adc86c3716b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-electricfield.sty \
tex-pst-electricfield.tex \
texlive-pst-electricfield"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
