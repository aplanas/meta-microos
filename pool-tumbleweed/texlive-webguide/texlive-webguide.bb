SUMMARY = "Brief Guide to LaTeX Tools for Web publishing"
DESCRIPTION = "The documentation constitutes an example of the package's own \
recommendations (being presented both in PDF and HTML)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25813"

RPM_NAME = "texlive-webguide-2023.201.svn25813-53.1.noarch.rpm"
RPM_HASH = "903f307f83a5d9b5e6964e275130a78ccd4acedf532c09e84d45b134c905ab6145ab6c57de9bb6769f2acf7f4666e3f226e43c28a8ed4d6eddcb606e7ef32c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-webguide"

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
