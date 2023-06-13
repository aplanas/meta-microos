SUMMARY = "A PSTricks package for coils, etcetera"
DESCRIPTION = "Pst-coil is a PSTricks based package for coils and zigzags and \
for coil and zigzag node connections."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.07svn62977"

RPM_NAME = "texlive-pst-coil-2023.201.1.07svn62977-52.1.noarch.rpm"
RPM_HASH = "e88cb73bb7363097e11ea57e7432aa650bcbd7d45b555a1c43039827d0ddca67d67016f5d687dfcded5c4f18438cd4cf4a53e081c2da8d3de13c9223649574e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-coil.sty) \
tex(pst-coil.tex) \
texlive-pst-coil"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
