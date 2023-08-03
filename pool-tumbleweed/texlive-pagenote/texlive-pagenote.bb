SUMMARY = "Notes at end of document"
DESCRIPTION = "The pagenote package provides tagged notes on a separate page \
(also known as 'end notes'). Unless the memoir class is used, \
the package requires the ifmtarg package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn63708"

RPM_NAME = "texlive-pagenote-2023.209.1.1asvn63708-52.1.noarch.rpm"
RPM_HASH = "4e9cc2d3977d7eab8c7375b10b9ab6e2d8c8fe0f301648993a94b48cbe66f418f1097b69d2ef1ae4738519bd57cfc7672ca81b0673ef4fb6ae2abbddb8ee0db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagenote.sty \
texlive-pagenote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
