SUMMARY = "Set space between lines"
DESCRIPTION = "Provides support for setting the spacing between lines in a \
document. Package options include singlespacing, \
onehalfspacing, and doublespacing. Alternatively the spacing \
can be changed as required with the \\singlespacing, \
\\onehalfspacing, and \\doublespacing commands. Other size \
spacings also available."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.7bsvn65206"

RPM_NAME = "texlive-setspace-2023.201.6.7bsvn65206-53.1.noarch.rpm"
RPM_HASH = "0c47dd5093ed4ea64d8514a76179e6d73c640879b308eb154933af556076292106879e4280dab422b7eacd4dabac9b2f91e2ad1568c207c80e3bf68b7465c96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(setspace.sty) \
texlive-setspace"

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
