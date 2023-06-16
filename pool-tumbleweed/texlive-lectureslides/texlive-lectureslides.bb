SUMMARY = "Combine single PDF files into one file"
DESCRIPTION = "This package makes it easy to combine and index individual PDF \
files into one large PDF file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62292"

RPM_NAME = "texlive-lectureslides-2023.201.1.0svn62292-54.1.noarch.rpm"
RPM_HASH = "0a6bbde29a25f9b1561b297d6fa3649aa331160d020c0c8cd5526cfec6864a689eb2f2f33403000faed4e2cf3e4817ebeddb450334c981046fec7d9a9ac25a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lectureslides.sty \
texlive-lectureslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
