SUMMARY = "UnofficiaL BibTeX style for citing Japanese articles in IEEE format"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors \
trying to cite Japanese articles in the Institute of Electrical \
and Electronics Engineers (IEEE) format."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn65642"

RPM_NAME = "texlive-jieeetran-2023.209.0.0.19svn65642-56.1.noarch.rpm"
RPM_HASH = "d7584160396c1d5a23f3396f24188609c0dd73d3ac01adb4536d0a11668624b3abc672edd0addb99bf46937b3046e06c174ecb1523f816839a94eeea328f10b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jieeetran"

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
