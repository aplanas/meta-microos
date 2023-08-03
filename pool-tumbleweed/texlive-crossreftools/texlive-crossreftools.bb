SUMMARY = "Expandable extraction of cleveref data"
DESCRIPTION = "This package extracts information from cross-referencing \
labels, especially those from cleveref, in an expandable \
manner."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55879"

RPM_NAME = "texlive-crossreftools-2023.209.1.0svn55879-55.1.noarch.rpm"
RPM_HASH = "35aea2e1e3752fa917887940205b1c096886da080f5818c7f50bd2ce545528f695f4447bca3258b3331d0372100eb8d47f4e976e56dbb60e1ce45d37f9dff3c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crossreftools.sty \
texlive-crossreftools"

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
