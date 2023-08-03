SUMMARY = "Documentation support for C, Java and assembler code"
DESCRIPTION = "The package provides a simple means of typesetting computer \
programs such that the result is acceptable for inclusion in \
reports, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34521"

RPM_NAME = "texlive-documentation-2023.209.0.0.1svn34521-53.1.noarch.rpm"
RPM_HASH = "b1685fb281fed46060a8ff3bcd6a65f6d7d41ed4ed0e51c459e5a311f8ac4032937b92f00e98c2665438f899b291e08b46168213f9415e632264b636922e7f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-documentation.sty \
texlive-documentation"

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
