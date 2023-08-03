SUMMARY = "Support for symmetric groups"
DESCRIPTION = "A package for symmetric groups, allowing you to input, output, \
and calculate with them."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-permute-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "15663545888fba4c6231e3204d886f2abccb6b3326908e914f196f8b161493dd660599fb81c27998b5666a48b7ccba9620397e1529331ed38b20ee06654c5768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-permute.sty \
texlive-permute"

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
