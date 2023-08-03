SUMMARY = "LaTeX package for the English raised decimal point"
DESCRIPTION = "This LaTeX package should be used by people who need the \
traditional English raised decimal point, instead of the \
American-style period."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23374"

RPM_NAME = "texlive-decimal-2023.209.svn23374-53.1.noarch.rpm"
RPM_HASH = "1f2ce8a1ce0e46459e3e681970b5bc3da5adf1cafc80e5890f2534847e6760c83c4cdffc55ff3217b883856c63432b567b9499ce4281d0ee0816f8e8c5d0cc89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decimal.sty \
texlive-decimal"

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
