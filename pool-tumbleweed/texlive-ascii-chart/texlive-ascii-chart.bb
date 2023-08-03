SUMMARY = "An ASCII wall chart"
DESCRIPTION = "The document may be converted between Plain TeX and LaTeX \
(2.09) by a simple editing action."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20536"

RPM_NAME = "texlive-ascii-chart-2023.209.svn20536-54.1.noarch.rpm"
RPM_HASH = "947db39539e76ea5ae0d410589a4b2e62fcfe12208b79ff03e2d1878bf4987e350c2a33c65a86ff03f0c017a7541938024633db6d87b0724d5ce3d40dee24515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-chart"

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
