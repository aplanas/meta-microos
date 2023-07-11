SUMMARY = "Simplify typesetting of derivatives"
DESCRIPTION = "The package makes writing derivatives very easy. It offers \
macros for derivatives, partial derivatives and multiple \
derivatives, and allows specification of the point at which the \
value is calculated. Some typographic alternatives may be \
selected by package options"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21385"

RPM_NAME = "texlive-esdiff-2023.201.1.2svn21385-53.2.noarch.rpm"
RPM_HASH = "15a15ee98656dcdc0867c34c67b069fd7077895dfaea92514e81dfc7cd1a02ad5fd6a2d32c70f57af409ac3080b80b10dd3d7b61459ea5e6dd5136d9fe07e519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esdiff.sty \
texlive-esdiff"

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
