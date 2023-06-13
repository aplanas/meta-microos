SUMMARY = "Unofficial bibliography style file for the Institute of Electrical Engineers of Japan"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors of \
the Institute of Electrical Engineers of Japan (IEEJ) \
transactions journals and conferences."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-2023.201.0.0.19svn65641-52.1.noarch.rpm"
RPM_HASH = "e4ae658fd1be56083a2fcc82aa48c91ecbb4e37b2cf32c4030f9e0e60082e96eca795c7d30c5056f46a66a769d087dedbdef7a00b4fc69260384bc9acafb62f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieejtran"

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
