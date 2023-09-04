SUMMARY = "Name tags for equations"
DESCRIPTION = "The \\eqname command provides a name tag for the current \
equation, in place of an equation number. The name tag will be \
picked up by a subsequent \\label command."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20678"

RPM_NAME = "texlive-eqname-2023.209.svn20678-54.2.noarch.rpm"
RPM_HASH = "478b6721650134b37e09909528af3ffde23545ba62c8936494e49cabee5282fdc2e6a984c77e18392902eb2b2616a85f61ab00148df2cfa1fa8f8322d54e2f96"
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
