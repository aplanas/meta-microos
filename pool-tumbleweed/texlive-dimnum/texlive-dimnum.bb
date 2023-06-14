SUMMARY = "Commands for dimensionless numbers"
DESCRIPTION = "This package simplifies the calling of Dimensionless Numbers in \
math or text mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-2023.201.1.0.1svn58774-52.1.noarch.rpm"
RPM_HASH = "c0a52f5a547586a3e3afa61613530dc5bd1c1c486ef6e426ac982fa093572fdab100b3eae629c589d0d0b5aebfc179b780ba55292454d28ec77b70c5d64f75eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dimnum.sty \
texlive-dimnum"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
