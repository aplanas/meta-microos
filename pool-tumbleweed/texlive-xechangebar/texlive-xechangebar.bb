SUMMARY = "An extension of package changebar that can be used with XeLaTeX"
DESCRIPTION = "The package extends package changebar so it can be used with \
XeLaTeX. It introduces the new option xetex for use with \
XeLaTeX. Everything else remains the same and users should \
consult the original documentation for usage information."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-xechangebar-2023.209.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "7f6973fe2c7effe83b4da80a3ef3a7f54ed61c567362cad6e67accbd1863fbb6668b3d6a5305afc84d2ae59c459c24fc809ef682c83deaec2230880a36aab902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xechangebar.sty \
texlive-xechangebar"

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
