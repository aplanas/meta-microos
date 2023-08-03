SUMMARY = "Brief Guide to LaTeX Tools for Web publishing"
DESCRIPTION = "The documentation constitutes an example of the package's own \
recommendations (being presented both in PDF and HTML)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25813"

RPM_NAME = "texlive-webguide-2023.209.svn25813-54.1.noarch.rpm"
RPM_HASH = "e9ada34e5b1bfa843bd687ff0c956fca3ad4b24bf41d507d0da135bc175728872df1cc4fd41affe5b54d99f052b4135e2c95753d3acacb006a13e1465e7a9796"
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
