SUMMARY = "Optionally omit pieces of text"
DESCRIPTION = "Stephan Bellantoni's version has provided preamble commands for \
selecting environments to be included/excluded. This package \
does the same, but corrects, improves, and extends it in both \
implementation and function."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.55svn21921"

RPM_NAME = "texlive-versions-2023.201.0.0.55svn21921-53.1.noarch.rpm"
RPM_HASH = "08cdf0823e6cd72f2d7a69c6bc89534fc9566d246335e7cc5e24dbc65515318b87f82356f9221fb1122d35569a697a8788f457c14f34bd195f8d769de06b5124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-versions.sty \
texlive-versions"

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
