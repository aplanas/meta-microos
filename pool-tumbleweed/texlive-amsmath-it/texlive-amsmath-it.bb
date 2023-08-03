SUMMARY = "Italian translations of some old amsmath documents"
DESCRIPTION = "The documents are: diffs-m.txt of December 1999, and \
amsmath.faq of March 2000."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22930"

RPM_NAME = "texlive-amsmath-it-2023.209.svn22930-55.1.noarch.rpm"
RPM_HASH = "33c9dc2d790c19748a67c4f43c7baec5ef02dd91528050d6bb829d71c2b822ae6275a64f75fc8d40b9540213f9a0d8207ffe4bd942dceb4577d06d5aae63e40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsmath-it"

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
