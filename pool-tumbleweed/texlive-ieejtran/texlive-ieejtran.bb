SUMMARY = "Unofficial bibliography style file for the Institute of Electrical Engineers of Japan"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors of \
the Institute of Electrical Engineers of Japan (IEEJ) \
transactions journals and conferences."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-2023.208.0.0.19svn65641-53.1.noarch.rpm"
RPM_HASH = "8c4ece5721630e3b289776f1aa1c18f3ff8e88bf5d09a5c793d1a8c1f2f2be92bc1665f5ed5c611bf7eb6cded844be6d0fa838f5398d7c155cbd35a46f46ea3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieejtran"

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
