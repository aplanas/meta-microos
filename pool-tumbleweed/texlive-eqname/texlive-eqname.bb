SUMMARY = "Name tags for equations"
DESCRIPTION = "The \\eqname command provides a name tag for the current \
equation, in place of an equation number. The name tag will be \
picked up by a subsequent \\label command."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20678"

RPM_NAME = "texlive-eqname-2023.201.svn20678-53.2.noarch.rpm"
RPM_HASH = "252b898e6e6a3b40c894060573876ae72b8a3c1b8725e72a25d80ad646dd0a754a2e8e71e0ad5999c367a53dfbfa03430d0bb4f66622cfea42284cb1b1179362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqname.sty \
texlive-eqname"

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
