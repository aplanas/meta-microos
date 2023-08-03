SUMMARY = "Using array structures in LaTeX"
DESCRIPTION = "The package provides functionality for processing lists and \
array structures in LaTeX. Arrays can contain characters as \
well as TeX and LaTeX commands, nesting of arrays is possible, \
and arrays are processed within the same brace level as their \
surrounding environment. Array levels can be delimited by \
characters or control sequences defined by the user. Practical \
uses of this package include data management, construction of \
lists and tables, and calculations based on the contents of \
lists and arrays."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-forarray-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "383c0f14fdd7b7569ce59e21c434e6da551d29cdf3c03ad21e3ad4acdd3c0de47a8efb63969e85ebfb0b3e780e9f316b742bd32157641af0f4fc32f0a2fbce84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forarray.sty \
texlive-forarray"

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
