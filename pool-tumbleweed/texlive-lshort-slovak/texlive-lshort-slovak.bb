SUMMARY = "Slovak introduction to LaTeX"
DESCRIPTION = "A Slovak translation of Oetiker's (not so) short introduction."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-lshort-slovak-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "41fb09e8bbf90c84f6619d5bb34d5d34e11ae98bb6c488bf0d979815cc216e74fe90ccd4214b481dfa1be864427c9ca575316ee0096ac5badd95275e0f0d7f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovak"

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
