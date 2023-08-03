SUMMARY = "A PSTricks package for coils, etcetera"
DESCRIPTION = "Pst-coil is a PSTricks based package for coils and zigzags and \
for coil and zigzag node connections."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.07svn62977"

RPM_NAME = "texlive-pst-coil-2023.209.1.07svn62977-53.1.noarch.rpm"
RPM_HASH = "43680e25ead85dfa0d7de9899b299bffad7c36e0e78e4b70ed169372180e0a85b11814c69be7003475ee04db181cf16c24cf1f859afb13c19504250686060bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-coil.sty \
tex-pst-coil.tex \
texlive-pst-coil"

RDEPENDS:${PN} += "/usr/bin/sh \
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
