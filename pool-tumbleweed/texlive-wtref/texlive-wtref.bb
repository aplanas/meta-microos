SUMMARY = "Extend LaTeX's cross-reference system"
DESCRIPTION = "This package extends the cross-reference system of LaTeX2e and \
introduces concepts of namespace and scope. It also allows \
users to customize reference formats. The package is part of \
the WT Series. Prerequisite packages: xparse and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-2023.201.0.0.4.0svn55558-52.2.noarch.rpm"
RPM_HASH = "29cbb97cb1ead11a2c3052f990b89765558db2f3e85773e53012310d9fd469355cbb1da40c3d2bf623a41234e80437f49aa9b971fdce2f5e1eeeb8b5df8e7239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wtref.sty \
texlive-wtref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
