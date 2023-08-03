SUMMARY = "Thumb marks in documents"
DESCRIPTION = "Place thumb marks in books, manuals and reference maunals."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn16549"

RPM_NAME = "texlive-thumb-2023.209.1.0svn16549-55.1.noarch.rpm"
RPM_HASH = "4d05a42a74d1e025ff4dd0c7e5d81e4dbd538b0160b153865c5576f71a24879c114bc72d20c6209a6522e63e9fc7c0c819b76bbac0b4a28dae3da3dcc071bcd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumb.sty \
texlive-thumb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-minitoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
