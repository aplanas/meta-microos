SUMMARY = "Notes at end of document"
DESCRIPTION = "The pagenote package provides tagged notes on a separate page \
(also known as 'end notes'). Unless the memoir class is used, \
the package requires the ifmtarg package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn63708"

RPM_NAME = "texlive-pagenote-2023.201.1.1asvn63708-51.1.noarch.rpm"
RPM_HASH = "9916e09d71d59a8f95c3608be7801441d352c67e4b0402e61a61beb52ec5ae4b208e6cd10ccc45454ff6c2987137f52087638a60ef79752beb98a565f8bddad5"
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
