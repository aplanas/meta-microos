SUMMARY = "Examples from 'The LaTeX Companion', second edition"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files. The book was published by \
Addison-Wesley, 2004, ISBN 0-201-36299-6."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn26096"

RPM_NAME = "texlive-tlc2-2023.201.svn26096-52.1.noarch.rpm"
RPM_HASH = "db8184a1497cf877e164c6f36abfcf6be1f60f26a325f5c6da5fc3b40f772367e294ac7d160a23ddf8110129e6609e2324cc927815b119337cfde05f87fa7721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc2"
RDEPENDS:${PN} += "/bin/sh \
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
