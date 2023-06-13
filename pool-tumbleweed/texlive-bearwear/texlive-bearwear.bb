SUMMARY = "Shirts to dress TikZbears"
DESCRIPTION = "The package offers tools to create shirts for TikZbears from \
the TikZlings package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-2023.201.0.0.2svn54826-53.1.noarch.rpm"
RPM_HASH = "706bd13d09f8f9484e524abe2cf5ffcfad259ac2f77782ef9b10f7afb6ca095f4c888828ebcb3e3ae90db2e603c401c735b54c3a9b30e6908fee33add0c0d41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bearwear.sty) \
texlive-bearwear"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikzlings-bears.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
