SUMMARY = "Slovenian translation of lshort"
DESCRIPTION = "A Slovenian translation of the Not So Short Introduction to \
LaTeX 2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.4.20svn55643"

RPM_NAME = "texlive-lshort-slovenian-2023.208.4.20svn55643-53.1.noarch.rpm"
RPM_HASH = "51fe9c58b840dc90cedfcde21802e3ab2e4639137aa4865d4b062ce352f15ee4a2e74936a6b378135b2977935c0be4b85949aaaea1013a1abb6b239ccab29a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovenian"

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
