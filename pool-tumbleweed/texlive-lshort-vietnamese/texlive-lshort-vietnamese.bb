SUMMARY = "Vietnamese version of the LaTeX introduction"
DESCRIPTION = "Vietnamese version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.00svn55643"

RPM_NAME = "texlive-lshort-vietnamese-2023.208.4.00svn55643-53.1.noarch.rpm"
RPM_HASH = "371cf73eaedc6e60d58a799b1794f3ef22e56fc46f26b7a1261fcb8dc5db97296add873e75f8d0afb8dcb271acf254b1ecac3fe48d67f022777bc346a50eb59d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-vietnamese"

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
