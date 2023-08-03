SUMMARY = "Create illustrations for network protocol specifications"
DESCRIPTION = "The bytefield package helps the user create illustrations for \
network protocol specifications and anything else that utilizes \
fields of data. These illustrations show how the bits and bytes \
are laid out in a packet or in memory."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn60265"

RPM_NAME = "texlive-bytefield-2023.209.2.7svn60265-53.1.noarch.rpm"
RPM_HASH = "fb15a0d4267cc1df7cefedd6084c9e489caecc4f368d5e6a4f8f98cf78de2b1b78563f2e5319b3131198c6945d09d1f8d2b5f84e2276db405decfd5d0ce557a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bytefield.sty \
texlive-bytefield"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
