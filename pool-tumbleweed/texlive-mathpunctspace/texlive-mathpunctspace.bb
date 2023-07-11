SUMMARY = "Control the space after punctuation in math expressions"
DESCRIPTION = "This package provides a mechanism to control the space after \
commas and semicolons in mathematical expressions."
LICENSE = "BSD-3-Clause"

PV = "2023.208.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-2023.208.1.1svn46754-53.1.noarch.rpm"
RPM_HASH = "bc6851acb7329a1758624b67623c294e3ac8da2022ecd5f4f9f08e5367a0d6970c4840ea1f16deb2cc6407e647de6412e45211ca534a40547439f5d22dd6288a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathpunctspace.sty \
texlive-mathpunctspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
