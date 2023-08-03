SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard style recommended by the University of Bath \
Library. It should be used in conjunction with natbib for \
citations."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63398"

RPM_NAME = "texlive-bath-bst-2023.209.6.0svn63398-54.1.noarch.rpm"
RPM_HASH = "f9371ae7782f8c79aa4273196ebbb4bdea9549fbc45eb2325b73eb3fe381a39cda2493f073eabafa77a7e7daa0d151b3af2511e4269519b1734c688a316343c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst"

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
