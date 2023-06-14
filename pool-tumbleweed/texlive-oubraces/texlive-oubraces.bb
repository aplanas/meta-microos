SUMMARY = "Braces over and under a formula"
DESCRIPTION = "Provides a means to interleave \\overbrace and \\underbrace in \
the same formula."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21833"

RPM_NAME = "texlive-oubraces-2023.201.svn21833-54.1.noarch.rpm"
RPM_HASH = "0ffcc0a2b835a1d7367bff3826eaa8971895f5f72bd57408c32e21ea3931e40c0baad068c441c0a2518ef4be2e32fa313bfb1c10f18c62682848a48899cbe502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oubraces.sty \
texlive-oubraces"

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
