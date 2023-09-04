SUMMARY = "Easing functions for pgfmath"
DESCRIPTION = "This library implements a collection of easing functions and \
adds them to the PGF mathematical engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn59975"

RPM_NAME = "texlive-easing-2023.209.0.0.1svn59975-54.2.noarch.rpm"
RPM_HASH = "f1ea16a97259f1069da066f552b2dc573a1121cec6d05c6164d6b1ce7909a156a91d240ddebd35559f97a1d174acda6cc4360c57b3cc13048d90e400a5aaf3d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibraryeasing.code.tex \
texlive-easing"

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
